package com.example.Pfe_backend.Service;

import com.example.Pfe_backend.Entity.Utilisateur;
import com.example.Pfe_backend.Repository.UtilisateurRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurService  {
    private UtilisateurRepository utilisateurRepository;
    public List<Utilisateur> getUtilisateur(){
        return utilisateurRepository.findAll();
    }
}
