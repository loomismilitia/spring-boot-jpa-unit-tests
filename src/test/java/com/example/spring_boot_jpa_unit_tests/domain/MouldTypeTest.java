package com.example.spring_boot_jpa_unit_tests.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
public class MouldTypeTest {

    @Autowired
    protected TestEntityManager entityManager;

    @Autowired
    private MouldTypeRepository repository;

    @Test
    public void saveShouldPersistData() {

        MouldType mouldType = this.entityManager.persistFlushFind(MouldTypeTest.createSampleMouldType());

        assertThat(mouldType.getId()).isEqualTo((short)2);
        assertThat(mouldType.getName()).isEqualTo("2K Injection");
    }

    @Test
    public void saveWithRepositoryShouldPersistData() {
        this.repository.save(createSampleMouldType());
        MouldType mouldType = this.repository.findOne((short) 1);
        assertThat(mouldType.getName()).isEqualTo("2K Injection");
    }

    static MouldType createSampleMouldType(){
        return new MouldType((short) 2, "2K Injection");
    }
}