package br.com.mateus.springcoredemo.config;

import br.com.mateus.springcoredemo.common.Coach;
import br.com.mateus.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {


    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
