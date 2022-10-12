/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mintic.empresa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author USER
 */
@ControllerAdvice
public class EmpleadoNoEncontradoAviso {
    
    @ResponseBody
    @ExceptionHandler(EmpleadoNoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    
    public String empleadoNoEncontrado(EmpleadoNoEncontradoException ex){
        return ex.getMessage();
    
    
    }
    
}
