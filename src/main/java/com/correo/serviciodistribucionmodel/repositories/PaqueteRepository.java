package com.correo.serviciodistribucionmodel.repositories;


import com.correo.serviciodistribucionmodel.model.dbentities.Paquete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PaqueteRepository extends JpaRepository<Paquete, Long> {
}
