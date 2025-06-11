/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudioGG.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Gonzalo_Avalos
 */
@Controller
@RequestMapping("/demanda")
public class ServerController {

    private static final Logger logger = LoggerFactory.getLogger(ServerController.class);

    // Muestra el formulario para crear una nueva historia clínica
    @GetMapping("/health")
    public String getHealth(Model model) {
        return "OK";
    }
}
