/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolio.mgb.Service;

import com.portfolio.mgb.Entity.habilidades;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.mgb.Repository.RHabilidades;

@Transactional
@Service
public class SHabilidades {
    @Autowired
    RHabilidades rhys;
    
    public List<habilidades> list(){
        return rhys.findAll();
    }
    
    public Optional<habilidades> getOne(int id){
        return rhys.findById(id);
    }
    
    public Optional<habilidades> getByNombre(String nombre){
        return rhys.findByNombre(nombre);
    }
    
    public void save(habilidades skill){
        rhys.save(skill);
    }
    
    public void delete(int id){
        rhys.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rhys.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rhys.existsByNombre(nombre);
    }
}
