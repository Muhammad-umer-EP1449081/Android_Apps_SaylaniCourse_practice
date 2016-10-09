package com.example.scb.report_card;

/**
 * Created by scb on 10/9/2016.
 */
public class Student_model
{
    String name;
    String fathername;
    String dateofbirth;
    String rollno;

    public String getName() {
        return name;
    }

    public String getFathername() {
        return fathername;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public String getRollno() {
        return rollno;
    }

    public String getEducation() {
        return Education;
    }

    public String getNameofinstitution() {
        return nameofinstitution;
    }

    String Education;
    String nameofinstitution;

    Student_model(String name, String fathername, String dateofbirth,String rollno,String education,String nameofinstitution)
    {
        this.name=name;
        this.fathername=fathername;
        this.dateofbirth=dateofbirth;
        this.Education = education;
        this.nameofinstitution=nameofinstitution;
        this.rollno=rollno;
    }
}
