package com.example.Pfe_backend.Controller;


import com.example.Pfe_backend.Entity.Pays;
import com.example.Pfe_backend.Service.PaysService;
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
@CrossOrigin("*")
@RequestMapping("/api/v5")
public class PaysController {
    private PaysService paysService;

    @GetMapping("/pays")
    public List<Pays> getPays(){
        return paysService.getPays();
    }
}
