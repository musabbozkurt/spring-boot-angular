package com.springbootangular.bootangular.repository;

import com.springbootangular.bootangular.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
