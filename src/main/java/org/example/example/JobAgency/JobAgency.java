package org.example.JobAgency;

import org.example.Company.Vacancy;
import org.example.JobSeekers.Observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private Collection<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {

        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, Vacancy skill, int salary) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, skill, salary);
        }
    }
}