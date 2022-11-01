/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Repository;

import com.portfolio.mgb.Entity.habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface RHabilidades extends JpaRepository<habilidades, Integer>{
    Optional<habilidades> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
