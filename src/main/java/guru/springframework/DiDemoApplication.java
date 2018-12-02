package guru.springframework;

import guru.springframework.ExampleBeans.FakeDatasource;
import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.GetterInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {



	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

//		MyController controller = (MyController) ctx.getBean("myController");

//		System.out.println(controller.hello());
//		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
//		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

		FakeDatasource source = ctx.getBean(FakeDatasource.class);

		System.out.println("USERNAME : " +source.getUsernmae());
		System.out.println("PASSWORD : " +source.getPassword());
		System.out.println("URL : " +source.getUrl());
	}
}
