package foobar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import an.awesome.pipelinr.Pipeline;

@SpringBootApplication
public class App {
    @Autowired
    Pipeline pipeline;

    public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
            String response = new Wave().execute(pipeline);
            System.out.println(response); 
		};
	}
}
