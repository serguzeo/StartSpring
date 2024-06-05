package com.serguzeo.StartSpring.repositories;

import com.serguzeo.StartSpring.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IMessageRepository extends JpaRepository<Message, UUID> {
}
