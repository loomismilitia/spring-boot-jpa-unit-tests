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
public class MouldTest {

    @Autowired
    protected TestEntityManager entityManager;

    @Test
    public void saveShouldPersistData() {

        MouldType mouldType = this.entityManager.persistFlushFind(MouldTypeTest.createSampleMouldType());

        Mould mp6666 = this.entityManager.persistFlushFind(new Mould("MP6666", mouldType));
        assertThat(mp6666.getId()).isGreaterThan(0);
        assertThat(mp6666.getCode()).isEqualTo("MP6666");

    }

}