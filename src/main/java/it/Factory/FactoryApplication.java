package it.Factory;

import it.Factory.exemplu1.bean.AppConfig;
import it.Factory.exemplu1.bean.Pisica;
import it.Factory.exemplu2.stereotype.config.StereotypeConfig;
import it.Factory.exemplu2.stereotype.service.MyService;
import it.Factory.exemplu2.stereotype.service.MyServiceImpl;
import it.Factory.exemplu3.dependencyinjection.config.UserConfig;
import it.Factory.exemplu3.dependencyinjection.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class FactoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryApplication.class, args);
//******************EXEMPLU1 BEAN**************************************************************************************
//		AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(AppConfig.class);
//
//
//		Pisica p1 = context1.getBean("pisicaOpt",Pisica.class);
//		Pisica p2 = context1.getBean("pisicaDoi",Pisica.class);
//		Pisica p3 = context1.getBean("pisicaDoi",Pisica.class);
//
//		System.out.println("p1: " + p1 + " p2: " + p2.getNume() + " p3: " + p3.getNume());

//**********************************************************************************************************************

//*******************EXEMLPU2 stereotype********************************************************************************
//
//		AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(StereotypeConfig.class);
//
//		MyService service1 = context2.getBean("myServiceImpl", MyService.class);
//		MyService service2 = context2.getBean("otherServiceImpl", MyService.class);
//
//		MyService service3 = new MyServiceImpl();
//
//		System.out.println("service1: " + service1 + " service2: " + service2);
//
//		service1.doSomething();
//		service2.doSomething();

//*************************************************************************************************************************

//*******************EXEMLPU3 DI********************************************************************************

		AnnotationConfigApplicationContext context3 = new AnnotationConfigApplicationContext(UserConfig.class);

		UserService userService = context3.getBean("userService",UserService.class);

		System.out.println(userService.getAllUsers());




	}

}
