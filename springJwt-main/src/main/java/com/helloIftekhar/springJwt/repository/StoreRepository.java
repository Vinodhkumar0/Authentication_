package com.helloIftekhar.springJwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helloIftekhar.springJwt.model.StoreDetails;


public interface StoreRepository  extends JpaRepository<StoreDetails,Long> {

}
