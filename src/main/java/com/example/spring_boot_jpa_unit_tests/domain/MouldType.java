package com.example.spring_boot_jpa_unit_tests.domain;

import lombok.Getter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;

@Getter
@Entity
class MouldType extends AbstractPersistable<Short> {

    private String name;

    MouldType() {
        // thank you JPA \m/
    }

    MouldType(Short id, String name) {
        this.setId(id);
        this.name = name;
    }
}
