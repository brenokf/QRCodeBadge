package com.aplication.QRCodeBadgeGenerator.repository;


import com.aplication.QRCodeBadgeGenerator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByNameContainingIgnoreCase(final String name);
}
