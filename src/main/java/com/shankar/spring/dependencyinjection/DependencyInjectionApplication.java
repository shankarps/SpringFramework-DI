package com.shankar.spring.dependencyinjection;

import com.shankar.spring.dependencyinjection.controllers.GreetingController;
import com.shankar.spring.dependencyinjection.controllers.I18nController;
import com.shankar.spring.dependencyinjection.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);

		//Get the Controller object
		I18nController controller = (I18nController) ctx.getBean("i18nController");
		System.out.println(controller.sayHello());


	}

}
