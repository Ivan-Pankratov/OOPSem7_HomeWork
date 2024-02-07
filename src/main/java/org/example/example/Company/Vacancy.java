package org.example.Company;

import java.util.Locale;

/**
 * Вакансии
 */

public class Vacancy {

    private String companyName;
    private Skill skill;
    private int maxSalary;

    public Vacancy(String companyName, Skill skill, int maxSalary) {
        this.companyName = companyName;
        this.skill = skill;
        this.maxSalary = maxSalary;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(),
                "Компания: %s, вакансия: %s, зарплата %s ", companyName, skill, maxSalary);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }
}
