package com.example.Pfe_backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Module {

    @Id
    @Column(name = "Id")
    private int id_mod;
    private int lib_mod;
    private String activity;
}
