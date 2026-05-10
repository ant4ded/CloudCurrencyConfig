package my.idp.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudCurrencyConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudCurrencyConfigApplication.class, args);
	}
}
