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

public class Utilisateur {

    @Id
    @Column(name = "utilisateur")
    private String  matuser;
    private String codgrp;
    private String  nomuser ;
    private String motpasse;
    private String nomusera;

}
