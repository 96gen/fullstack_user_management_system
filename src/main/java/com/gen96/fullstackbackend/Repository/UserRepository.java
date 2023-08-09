package com.gen96.fullstackbackend.Repository;

import com.gen96.fullstackbackend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
