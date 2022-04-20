package com.example.Pfe_backend.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pays {


    @Id
    @Column(name = "pays")
    private int codpays ;
    private String libpays;
    private String nationalite;
    private String coddev;
    private String libnat ;

}
