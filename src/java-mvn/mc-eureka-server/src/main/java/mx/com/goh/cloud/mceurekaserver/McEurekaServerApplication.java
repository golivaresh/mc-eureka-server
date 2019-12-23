package mx.com.goh.cloud.mceurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class McEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(McEurekaServerApplication.class, args);
	}

}
