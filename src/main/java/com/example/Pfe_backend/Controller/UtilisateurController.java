package com.example.Pfe_backend.Controller;

import com.example.Pfe_backend.Entity.Utilisateur;
import com.example.Pfe_backend.Service.UtilisateurService;
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
@RequestMapping("/api/v3")
public class UtilisateurController {
    private UtilisateurService utilisateurService;

    @GetMapping("/utilisateur")
    public List<Utilisateur> getUtilisateur(){

        return utilisateurService.getUtilisateur();
    }

}
