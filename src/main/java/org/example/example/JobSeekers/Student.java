package org.example.JobSeekers;

import org.example.Company.Skill;
import org.example.Company.Programing;

import java.util.List;

public class Student extends Employee implements Observer{


    public Student(String name, int minSalary, List<Skill> skills) {
        super(name, minSalary, skills);
    }
}