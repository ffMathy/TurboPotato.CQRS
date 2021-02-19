package foobar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import an.awesome.pipelinr.Pipeline;

import foobar.queries.addtwonumbers.AddTwoNumbersQuery;

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
            Integer result = pipeline.send(new AddTwoNumbersQuery(4, 2));
            System.out.println("The result is " + result); 
		};
	}
}
