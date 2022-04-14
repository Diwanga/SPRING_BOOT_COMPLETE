package demo;

import org.springframework.stereotype.Component;


public class Nurse implements Staff {

    private  String university;

//    public Nurse(String university){
//        this.university= university;
//    }
    public void assist(){
        System.out.println("helping "+university);
    }
}
