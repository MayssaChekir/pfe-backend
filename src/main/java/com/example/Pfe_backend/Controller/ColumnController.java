package com.example.Pfe_backend.Controller;

import com.example.Pfe_backend.Entity.Column;
import com.example.Pfe_backend.Service.ColumnService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@NoArgsConstructor
@CrossOrigin
@RequestMapping("/api/v1")
public class ColumnController {
    private ColumnService columnService;

    @GetMapping("/column")
    public List<Column> getColumn(){

        return ColumnService.getColumn();
    }
}
