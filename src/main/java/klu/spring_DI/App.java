package klu.spring_DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        
        Employee emp = (Employee) context.getBean("emp1");

        
        emp.display();

        
        context.close();
    }
}
