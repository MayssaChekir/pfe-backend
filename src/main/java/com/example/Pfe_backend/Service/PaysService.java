package com.example.Pfe_backend.Service;

import com.example.Pfe_backend.Entity.Pays;
import com.example.Pfe_backend.Repository.PaysRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class PaysService {
    private PaysRepository paysRepository;



    public List<Pays> getPays(){
        return paysRepository.findAll();
    }

}
