package in.alam.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.alam.beans.Motor;

public class MainApp {
public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
	Motor motor=context.getBean(Motor.class);
	motor.dowork();
	
	ConfigurableApplicationContext cfgContext=(ConfigurableApplicationContext)context;
	cfgContext.registerShutdownHook();
   }
}
