/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mintic.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mintic.empresa.entity.Empleado;


/**
 *
 * @author USER
 */
public interface EmpleadoRepository extends JpaRepository<Empleado, Long >{
    
}
