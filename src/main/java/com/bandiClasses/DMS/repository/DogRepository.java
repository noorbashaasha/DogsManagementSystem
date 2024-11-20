package com.bandiClasses.DMS.repository;

/** @author S572176 [Asha Noorbasha]**/

import java.util.List;

/** @author S572176 [Asha Noorbasha]**/

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name); 

}
