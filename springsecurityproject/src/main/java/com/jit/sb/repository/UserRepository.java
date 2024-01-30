package com.jit.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jit.sb.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	//public User findByUsername(String username);
	
	 @Query("SELECT u FROM User u WHERE u.username = :username")
	    public User getUserByUsername(@Param("username") String username);

}
