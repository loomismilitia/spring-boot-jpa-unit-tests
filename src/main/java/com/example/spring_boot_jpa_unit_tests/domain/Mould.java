package com.example.spring_boot_jpa_unit_tests.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Getter
@Entity
@AllArgsConstructor
class Mould extends AbstractPersistable<Integer> {

    @Column(unique = true)
    private String code;

    @ManyToOne(optional = false)
    private MouldType mouldType;

}
