/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.empresa;

//import com.mintic.empresa.entity.Empleado;
import com.mintic.empresa.repository.EmpleadoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author USER
 */
@Configuration
public class CargarData {
    
   @Bean
   public CommandLineRunner iniciarBaseDatos(EmpleadoRepository repository){
       
       return (args)-> {
           /*repository.save (new Empleado("Carlos manuel", "administrador"));
           repository.save (new Empleado("Maria camila", "vendedora"));
           repository.save (new Empleado("arnulfo de jesus", "vigilante"));*/
       };
       
       
    }
       

   
}
    
    
    
