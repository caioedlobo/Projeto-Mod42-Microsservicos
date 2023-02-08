package br.com.caiolobo.vendas.online;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerAlunosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerAlunosApplication.class, args);
	}

}
