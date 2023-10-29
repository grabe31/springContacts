package dmacc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import dmacc.beans.Contact;
import dmacc.controller.BeanConfiguration;


/**
 * @author Eric Grabe - egrabe
 * CIS175 - Fall 2023
 * Oct 21, 2023
 */

@SpringBootApplication
public class SpringContactsApplication{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(SpringContactsApplication.class, args);
		
		
				
	}

}

//ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
//	Contact c = appContext.getBean("contact", Contact.class);
//	System.out.println(c.toString());
