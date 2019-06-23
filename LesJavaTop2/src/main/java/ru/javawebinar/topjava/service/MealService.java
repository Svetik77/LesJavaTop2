package ru.javawebinar.topjava.service;

import java.util.Collection;
import java.util.List;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.util.exception.NotFoundException;

public interface MealService {
	
	/** save -> create */
	Meal save(Meal meal);
	void delete (int id) throws NotFoundException;
	Meal get(int id) throws NotFoundException;
 	void update(Meal meal);

	 Collection<Meal> getAll();
}