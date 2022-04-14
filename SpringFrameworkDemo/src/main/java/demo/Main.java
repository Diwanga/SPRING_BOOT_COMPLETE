package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContextExtensionsKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Doctor doc = context.getBean(Doctor.class);
        doc.assist();
        Nurse nur = (Nurse) context.getBean("nurse");
        nur.help();
    }
}
