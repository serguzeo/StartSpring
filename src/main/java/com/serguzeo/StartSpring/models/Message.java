package com.serguzeo.StartSpring.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.UUID;

@Data
@Entity
@Table(name="messages")
public class Message {
    @Id
    private UUID uuid;
    private String text;
    private String date;

    public Message() {
        this.uuid = UUID.randomUUID(); // Генерация UUID при создании экземпляра класса
    }
}
