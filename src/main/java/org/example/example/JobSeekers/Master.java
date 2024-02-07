package org.example.JobSeekers;

import java.util.List;

public class Master extends Employee implements Observer {



    public Master(String name){
        this.name = name;
        salary = 80000;
        skills = List.of(new String[]{"programming", "management"});
    }

    @Override
    public void receiveOffer(String nameCompany, String skill, int salary) {
        if ((this.salary <= salary)&&(this.skills.contains(skill)) ){
            System.out.printf("Специалист %s: Мне нужна эта работа! (компания: %s; вид работ: %s заработная плата: %d)\n",
                    name, nameCompany, skill, salary);
            this.salary = salary;
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                    name, nameCompany, salary);
        }
    }
}
