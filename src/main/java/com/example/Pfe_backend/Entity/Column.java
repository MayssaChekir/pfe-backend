package com.example.Pfe_backend.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "column")
public class Column {

    @Id
    @javax.persistence.Column(name = "Id")
    private int id_mode;
    private int id_col;
    private String lib_col;
    private String src_col;
    private String src_table;

}
