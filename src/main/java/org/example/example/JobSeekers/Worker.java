package org.example.JobSeekers;

import org.example.Company.Skill;

import java.util.List;

public class Worker extends Employee implements Observer{

    public Worker(java.lang.String name, int minSalary, List<Skill> skills) {
        super(name, minSalary, skills);
    }
}


