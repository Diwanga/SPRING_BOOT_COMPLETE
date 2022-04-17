package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.sql.SQLOutput;


public class Doctor implements Staff , BeanNameAware {

    private String university;
    private Nurse nurse;
    public void assist(){
        System.out.println("assisting by 454doctor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Aware interface"); // SEE THIS ----->>>>> https://www.baeldung.com/spring-bean-name-factory-aware
    }
@PostConstruct
    public void postConstruct(){
        System.out.println("post construct");
    }

//    public void setNurse(Nurse nurse) {
//        this.nurse = nurse;
//    }
//    public void setUniversity(String university) {
//        this.university = university;
//    }


}
