package com.deva.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deva.model.Mob;

@Repository
public interface MobRepo extends CrudRepository<Mob, Integer> 
{}
