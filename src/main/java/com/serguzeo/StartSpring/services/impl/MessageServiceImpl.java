package com.serguzeo.StartSpring.services.impl;

import com.serguzeo.StartSpring.models.Message;
import com.serguzeo.StartSpring.repositories.IMessageRepository;
import com.serguzeo.StartSpring.services.I.IMessageService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class MessageServiceImpl implements IMessageService {
    IMessageRepository repository;

    @Override
    public List<Message> findAll() {
        return repository.findAll();
    }

    @Override
    public Message save(Message message) {
        return repository.save(message);
    }
}
