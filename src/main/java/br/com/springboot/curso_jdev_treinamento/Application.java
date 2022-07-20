package br.com.springboot.curso_jdev_treinamento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * Spring Boot application starter class
 */
@SpringBootApplication /* Faz a configuração automática da aplicação utilizando o pacote autoconfigure do Spring Boot */
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); /* É a linha principal que roda o projeto Java Spring Boot */
    }
}