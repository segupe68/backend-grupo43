/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.empresa.controllers;

import com.mintic.empresa.repository.EmpleadoRepository;
import com.mintic.empresa.entity.Empleado;
import com.mintic.empresa.exceptions.EmpleadoNoEncontradoException;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USER
 */
@RestController
public class EmpleadoController {
    
    private final EmpleadoRepository repository;

    public EmpleadoController(EmpleadoRepository repository) {
        this.repository = repository;
    }
    //hacemos una solicitud GET a la url : http://localhost:8080/empleados
    
    @GetMapping("/empleados")
    public List<Empleado> listarEmpleados(){
        return repository.findAll();
    
    }
    
    @GetMapping("/empleados/{idEmpleado}")
    public Empleado getEmpleado(@PathVariable Long idEmpleado){
        return repository.findById(idEmpleado).orElseThrow(()->{
            return new EmpleadoNoEncontradoException(idEmpleado);
           
        });
    }
    
    @PutMapping("/empleados/{idEmpleado}")
    public Empleado actualizarEmpleado (@PathVariable Long idEmpleado, @RequestBody Empleado nuevosEmpleado){
        return repository.findById(idEmpleado).map( empleado ->{
            
            empleado.setNombre(nuevosEmpleado.getNombre());
            empleado.setCargo(nuevosEmpleado.getCargo());
            return repository.save(empleado);
            
            
            
            
        }).orElseGet(() -> {
            nuevosEmpleado.setIdEmpleado(idEmpleado);
            return repository.save(nuevosEmpleado);
            
        
        });
        
                
        
    
    }
    @PostMapping("/empleados")
    public Empleado crearEmpleado(@RequestBody Empleado nuevoEmpleado){
        return repository.save(nuevoEmpleado);
    
    
    }
    @DeleteMapping("/empleados/{idEmpleado}")
    public void eliminarEmpleado(@PathVariable Long idEmpleado){
        repository.deleteById(idEmpleado);
    
    }
            
            
    
    
}
