package com.social.blog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.blog.user.model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{

}
