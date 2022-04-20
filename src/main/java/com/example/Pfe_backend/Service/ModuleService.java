package com.example.Pfe_backend.Service;

import com.example.Pfe_backend.Entity.Module;
import com.example.Pfe_backend.Repository.ModuleRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class ModuleService {
    private ModuleRepository moduleRepository;
    public List<Module> getModule(){
        return moduleRepository.findAll();   }
}
