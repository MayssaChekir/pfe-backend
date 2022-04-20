package com.example.Pfe_backend.Repository;

import com.example.Pfe_backend.Entity.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long> {
}
