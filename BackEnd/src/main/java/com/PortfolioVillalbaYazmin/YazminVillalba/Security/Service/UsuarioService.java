/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioVillalbaYazmin.YazminVillalba.Security.Service;

import com.PortfolioVillalbaYazmin.YazminVillalba.Security.Entity.Usuario;
import com.PortfolioVillalbaYazmin.YazminVillalba.Security.Repository.iUsuarioRepository;
import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yaz
 */
@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iUsuarioRepository; 
    
    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iUsuarioRepository.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return iUsuarioRepository.existsByNombreUsuario(nombreUsuario);
    }
    public boolean existsByEmail(String emsil){
        return iUsuarioRepository.existsByEmail(emsil);
    }
    public void save(Usuario usuario){
        iUsuarioRepository.save(usuario);
    }
}
