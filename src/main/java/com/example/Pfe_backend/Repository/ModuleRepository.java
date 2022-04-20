package com.example.Pfe_backend.Repository;

import com.example.Pfe_backend.Entity.Module;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

import java.util.List;

public interface ModuleRepository extends JpaAttributeConverter <Module,Long> {
    List<Module> findAll();
}
