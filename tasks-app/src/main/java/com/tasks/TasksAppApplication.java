package com.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan({"com.tasks.domain"})
@EnableJpaRepositories({"com.tasks.domain.repository", "com.tasks.security.repository"})
@SpringBootApplication(scanBasePackages = "com.tasks")
public class TasksAppApplication  {

    public static void main(String[] args) {
        System.out.println("Rodando a aplicação TaskApp");
        SpringApplication.run(TasksAppApplication.class, args);
    }

}
