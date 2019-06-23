package ru.javawebinar.topjava.util;
 
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import ru.javawebinar.topjava.model.Role;
import ru.javawebinar.topjava.model.User;

public class UserUtils {
	 Set<Role> roleSet = new HashSet<Role>();
	 
    public static final List<User> USERS = Arrays.asList(
    		new User(3, "user2", "user2@gmail.com", "33", 517, false, Role.ROLE_USER ),

    		 new User(1, "user1", "user1@gmail.com", "111", Role.ROLE_USER  ),
    		 new User(2, "admin", "admin@gmail.com", "000", Role.ROLE_ADMIN  ) 
    );
    
    public List<User> userListok() {
		return null;
    	
    }
}


	