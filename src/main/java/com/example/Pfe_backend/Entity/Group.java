package com.example.Pfe_backend.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;




@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data

public class Group {

    @Id
    private int codgrp;
    private int libgrp;

}
