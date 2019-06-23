package ru.javawebinar.topjava.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.repository.MealRepository;
import ru.javawebinar.topjava.util.exception.NotFoundException;

@Service
public class MealServiceImpl implements MealService {
	
	@Autowired
	private MealRepository repository;

	@Override
	public Meal save(Meal meal) {
		
		return repository.save(meal);
	}

	@Override   // ExceptionUtil
	public void delete(int id) throws NotFoundException {
//		ValidationUtil.checkNotFoundWithId(repository.delete(id), id);
		repository.delete(id);
	}
	
	 

	@Override
	public Meal get(int id) throws NotFoundException {
		
		return null;
	}

	@Override
	public void update(Meal meal) {
		
		
	}

	@Override
	public Collection<Meal> getAll() {
		
		return null;
	}
	
	

}