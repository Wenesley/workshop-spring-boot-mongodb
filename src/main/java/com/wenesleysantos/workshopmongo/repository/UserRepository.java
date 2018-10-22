package com.wenesleysantos.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.wenesleysantos.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
