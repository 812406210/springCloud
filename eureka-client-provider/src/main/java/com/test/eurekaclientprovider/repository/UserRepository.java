package com.test.eurekaclientprovider.repository;


import com.test.eurekaclientprovider.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
