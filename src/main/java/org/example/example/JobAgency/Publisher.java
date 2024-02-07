package org.example.JobAgency;

import org.example.Company.Vacancy;

/**
 * Активности агентства:
 * регистрация соискателей
 * удаление соискателей
 * публикация офера
 */

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(String companyName, Vacancy skill, int salary);

}