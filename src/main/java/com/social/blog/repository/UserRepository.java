package com.social.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.blog.user.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
