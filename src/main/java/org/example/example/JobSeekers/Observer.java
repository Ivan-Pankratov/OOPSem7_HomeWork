package org.example.example.JobSeekers;

import org.example.example.Company.Vacancy;

public interface Observer {

    boolean receiveOffer(Vacancy vacancy);

    boolean compareObserver(Employee employee);


}
