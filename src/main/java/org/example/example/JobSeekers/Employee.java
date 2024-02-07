package org.example.JobSeekers;

import org.example.Company.Skill;
import org.example.Company.Vacancy;

import java.util.List;


public abstract class Employee implements Observer{

    private final String name;
    private int minSalary;
    private final List<Skill> skills;

    public Employee(String name, int minSalary, List<Skill> skills) {
        this.name = name;
        this.minSalary = minSalary;
        this.skills = skills;
    }

    @Override
    public void receiveOffer(Vacancy vacancy){

        if ((this.minSalary <= vacancy.getMaxSalary()) &&
                (this.skills.contains(vacancy.getSkill()))){
            System.out.printf("Студент %s: Мне нужна эта работа! ", this.name + vacancy);
            this.minSalary = (int) vacancy.getMaxSalary();
        }
        else {
            System.out.printf("Студент %s: Я найду работу получше! ", this.name + vacancy);
        }
    }
}
