package com.shankar.spring.dependencyinjection;

import com.shankar.spring.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyinjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyinjectionApplication.class, args);

		//Get the Controller object
		MyController controller = (MyController) ctx.getBean("myController");
		System.out.println(controller.sayHello());

	}

}
