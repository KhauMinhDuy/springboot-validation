package com.khauminhduy.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khauminhduy.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
