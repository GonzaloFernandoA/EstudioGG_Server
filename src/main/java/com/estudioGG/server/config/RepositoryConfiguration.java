/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.estudioGG.server.config;

import com.estudioGG.server.model.Cliente;
import com.estudioGG.server.model.HistoriaClinica;
import com.estudioGG.server.repository.S3RepositoryImpl;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import software.amazon.awssdk.services.s3.S3Client;

@Configuration
public class RepositoryConfiguration {

    @Bean
    public S3RepositoryImpl<Cliente> clienteRepository(S3Client s3Client, ObjectMapper objectMapper) {
        return new S3RepositoryImpl<Cliente>(s3Client, objectMapper);
    }

    @Bean
    public S3RepositoryImpl<HistoriaClinica> historiaClinicaRepository(S3Client s3Client, ObjectMapper objectMapper) {
        return new S3RepositoryImpl<HistoriaClinica>(s3Client,  objectMapper);
    }
}
