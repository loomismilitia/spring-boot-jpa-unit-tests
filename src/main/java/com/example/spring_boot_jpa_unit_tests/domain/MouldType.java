package com.example.spring_boot_jpa_unit_tests.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Entity
@NoArgsConstructor
class MouldType {

    @Id
    private Short id;

    private String name;

    MouldType(Short id, String name) {
        this.id = id;
        this.name = name;
    }
}
