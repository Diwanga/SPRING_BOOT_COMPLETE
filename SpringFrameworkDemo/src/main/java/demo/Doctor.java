package demo;

import java.sql.SQLOutput;

public class Doctor implements Staff {

    private String university;
    private Nurse nurse;
    public void assist(){
        System.out.println("assisting by 454doctor");
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    public void setUniversity(String university) {
        this.university = university;
    }


}
