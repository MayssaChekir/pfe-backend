package com.example.Pfe_backend.Service;


import com.example.Pfe_backend.Entity.Column;
import com.example.Pfe_backend.Repository.ColumnRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ColumnService {
    private static ColumnRepository columnRepository;

    public static List<Column> getColumn(){

        return columnRepository.findAll();
    }
}
