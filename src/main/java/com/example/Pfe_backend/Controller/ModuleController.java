package com.example.Pfe_backend.Controller;


import com.example.Pfe_backend.Entity.Module;
import com.example.Pfe_backend.Service.ModuleService;
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
@RequestMapping("/api/v2")
public class ModuleController {
    private ModuleService moduleService;

    @GetMapping("/module")
    public List<Module> getModule(){
        return moduleService.getModule();
    }
}
