package ru.javawebinar.topjava.repository.mock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;
import ru.javawebinar.topjava.repository.UserRepository;
import ru.javawebinar.topjava.util.MealsUtil;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

// TODO D:\HereAllWorkspaces\AllTopJavkaEclipse\ThirdTopPatches
// TODO https://github.com/JavaWebinar/topjava/tree/master/src/main/java/ru/javawebinar/topjava
// TODO  5  D:\HereAllWorkspaces\AllTopJavkaEclipse\tHIRDtOP
// TODO  D:\all_java\MyTopJava7

@Repository
public class MockUserRepositoryImpl implements UserRepository {
    private static final Logger LOG = LoggerFactory.getLogger(MockUserRepositoryImpl.class);

    private Map<Integer, User> repository = new ConcurrentHashMap<>();
    private AtomicInteger counter = new AtomicInteger(0);
    
    {
    	save(new User(1, "user1", "user1@gmail.com", "111", Role.ROLE_USER ));
    	save(new User(1, "admin", "admin@gmail.com", "000", Role.ROLE_ADMIN ));
    }
    
    @Override
    public boolean delete(int id) {
        LOG.info("delete " + id);
        return repository.remove(id) != null;
    }

    @Override
    public User save(User user) {
        LOG.info("save " + user);
        if(user.isNew()) {
        	user.setId(counter.incrementAndGet());
        }
        repository.put(user.getId(), user);
        return user;
    }

    @Override
    public User get(int id) {
        LOG.info("get " + id);
        return repository.get(id);
    }

    @Override
//    public List<User> getAll() {
    public Collection<User> getAll() {
        LOG.info("getAll");
//        return Collections.emptyList();
        return repository.values();
    }

    @Override
    public User getByEmail(String email) {
        LOG.info("getByEmail " + email);
        return   getAll().stream()
        .filter(p -> p.getEmail().equals(email))
        .findFirst().orElse(null);
          
    }
}
