package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import beans.Team;
import beans.TeamImplementation;


@Configuration
@ComponentScan(basePackages={"beans"})         // finds cricketGame and cows
@ImportResource("classpath:second_config.xml") // imports cubs bean from xml
public class AppConfig {
	
	@Bean
	public Team redSox(){                      // defines redSox
		return new TeamImplementation("RedSox");
	}
	
}
