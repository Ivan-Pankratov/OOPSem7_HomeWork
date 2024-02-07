package org.example.example.JobAgency;

import org.example.example.Company.Vacancy;
import org.example.example.JobSeekers.Observer;

import java.util.ArrayList;
import java.util.Collection;

public class JobAgency implements Publisher {

    private final Collection<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String toString() {
        for (Observer observer : observers) {
            return observer.toString();
        }
        return "";
    }

    @Override
    public void sendOffer(Vacancy vacancy) {
        ArrayList<Observer> observersOff = new ArrayList<>();
        for (Observer observer : observers){
            if (observer.receiveOffer(vacancy)) observersOff.add(observer);
        }
        /*for (Observer observer: observersOff){
            observers(removeObserver(observer));
        }*/
        System.out.println("Список трудоустроенных: ");
        System.out.println(observersOff);
    }
}