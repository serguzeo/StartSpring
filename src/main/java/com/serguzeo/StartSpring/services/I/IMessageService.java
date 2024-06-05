package com.serguzeo.StartSpring.services.I;

import com.serguzeo.StartSpring.models.Message;

import java.util.List;

public interface IMessageService {
    List<Message> findAll();

    Message save(Message message);
}
