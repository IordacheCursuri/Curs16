package it.Factory.exemplu1.bean;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean(name = "pisicaOpt")
    public Pisica pisicaUnu() {
        Pisica pisica = new Pisica("Tom", 5);
        return pisica;
    }

    @Bean
   // @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    @Scope("prototype")
    public Pisica pisicaDoi() {
        Pisica pisica =  new Pisica("Mitzi", 8);
        return pisica;
    }






}
