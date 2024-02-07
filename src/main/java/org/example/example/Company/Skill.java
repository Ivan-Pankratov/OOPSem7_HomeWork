package org.example.Company;

public abstract class Skill {
    protected final String skillTitle;

    public String getSkillTitle() {
        return skillTitle;
    }

    public Skill(String skillTitle) {
        this.skillTitle = skillTitle;
    }
}
