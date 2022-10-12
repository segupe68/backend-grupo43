/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.empresa.exceptions;

/**
 *
 * @author USER
 */
public class EmpleadoNoEncontradoException extends RuntimeException {

    public EmpleadoNoEncontradoException(Long idEmpleado) {
        super("No se pudo encontrar Empleado con id: " + idEmpleado);
    }
    
    
    
}
