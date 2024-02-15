package com.micro.service.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.micro.service.models.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, UUID>{

}
