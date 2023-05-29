package Configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import models.Pizza;

@Configuration
public class ConfigurationPizza {
	
	@Bean
	@Scope("prototype")
	public Pizza pizzaMargherita(String nome, String valoriNutrizionali, double prezzo) {
		return new Pizza (nome, valoriNutrizionali, valoriNutrizionali, prezzo);
		
	}
	

}
