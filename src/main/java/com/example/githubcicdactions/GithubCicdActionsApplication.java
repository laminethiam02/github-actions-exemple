package com.example.githubcicdactions;

import jdk.jfr.Registered;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubCicdActionsApplication {

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to javatechie";
    }

   // echo "# github-actions-exemple" >> README.md
    //git init
    //git add README.md
    //git commit -m "first commit"
    //git branch -M main
    //git remote add origin https://github.com/laminethiam02/github-actions-exemple.git
    //git push -u origin main

    public static void main(String[] args) {
        SpringApplication.run(GithubCicdActionsApplication.class, args);
    }

}
