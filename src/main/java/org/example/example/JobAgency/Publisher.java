package org.example.example.JobAgency;

import org.example.example.Company.Vacancy;
import org.example.example.JobSeekers.Observer;

/**
 * Активности агентства:
 * регистрация соискателей
 * удаление соискателей
 * публикация офера
 */

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(Vacancy vacancy);

}