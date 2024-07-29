package com.SpringBoot.AOP.Repository;

import com.SpringBoot.AOP.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

