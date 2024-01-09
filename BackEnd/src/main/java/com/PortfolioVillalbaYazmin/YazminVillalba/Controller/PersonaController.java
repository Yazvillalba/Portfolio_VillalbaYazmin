/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.PortfolioVillalbaYazmin.YazminVillalba.Controller;

import com.PortfolioVillalbaYazmin.YazminVillalba.Entity.Persona;
import com.PortfolioVillalbaYazmin.YazminVillalba.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author yaz
 */

@RestController
public class PersonaController {
    @Autowired IPersonaService IPersonaService;
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return IPersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        IPersonaService.savePersona(persona);
        return "Persona creada con exito";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        IPersonaService.deletePersona(id);
        return "Persona eliminada con exito";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id, @RequestParam("nombre") String nuevoNombre,@RequestParam("apellido") String nuevoApellido, 
            @RequestParam("img") String nuevoimg){
        Persona persona = IPersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoimg);
        
        IPersonaService.savePersona(persona);
        return persona;
    }
    
}