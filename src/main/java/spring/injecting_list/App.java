package spring.injecting_list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/configuration/appliaction-context.xml");
        
        Student bean = context.getBean("student", Student.class);
        System.out.println(bean);
    }
}
