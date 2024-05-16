package com.helloIftekhar.springJwt.repository;

import com.helloIftekhar.springJwt.model.StoreDetails;
import com.helloIftekhar.springJwt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByUsername(String username);
    
//    @Query("Select e from User e where e.employeeId=?1")
//	Optional <User> findByEmployeeId(String employeeId);
}
