package ru.javawebinar.topjava.repository;


import java.util.Collection;

import ru.javawebinar.topjava.model.Meal;


/**
 * GKislin
 * 06.03.2015.
 */
public interface MealRepository {
    Meal save(Meal Meal);

    void delete(int id);

    Meal get(int id);

    Collection<Meal> getAll();
}
