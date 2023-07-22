package com.hydrofuture.HydroFuture.repository;

import com.hydrofuture.HydroFuture.application.model.Usuario;
import com.hydrofuture.HydroFuture.application.model.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {

    UsuarioEntity save(Usuario usuario);
    Optional<UsuarioEntity> findById(String id);

    void deleteById(String id);
}
