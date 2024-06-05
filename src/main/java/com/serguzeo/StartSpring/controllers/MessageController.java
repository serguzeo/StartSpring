package com.serguzeo.StartSpring.controllers;

import com.serguzeo.StartSpring.models.Message;
import com.serguzeo.StartSpring.services.I.IMessageService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/message")
public class MessageController {
    private final IMessageService messageService;

    @GetMapping
    public List<Message> findAll() {
        return messageService.findAll();
    }
}
