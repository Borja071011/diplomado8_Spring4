/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.servicio;

import com.mycompany.domain.Persona;
import java.util.List;

/**
 *levanta el servicio de los atrivutos los cuales son listar personas 
 * guardar 
 * eliminar
 * encontrar
 * @author Admin
 */
interface PersonaService {
    public List<Persona> listarpersonas();
    
    public void guardar(Persona persona);
      public void eliminar(Persona persona);
        public Persona encontrarPersona(Persona persona);
    
}
