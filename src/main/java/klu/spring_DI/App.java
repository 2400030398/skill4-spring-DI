package klu.spring_DI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

        // Step 1: Load Spring IoC Container
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("ApplicationContext.xml");

        // Step 2: Get Employee Bean from Container
        Employee emp = (Employee) context.getBean("emp1");

        // Step 3: Call method to display values
        emp.display();

        // Step 4: Close the container (IMPORTANT)
        context.close();
    }
}
