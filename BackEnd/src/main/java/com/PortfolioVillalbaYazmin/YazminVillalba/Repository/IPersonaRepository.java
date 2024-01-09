/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.PortfolioVillalbaYazmin.YazminVillalba.Repository;

import com.PortfolioVillalbaYazmin.YazminVillalba.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author yaz
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long>{
    
}
