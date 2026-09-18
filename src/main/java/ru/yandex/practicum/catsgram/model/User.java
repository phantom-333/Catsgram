package ru.yandex.practicum.catsgram.model;

import lombok.*;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = "email")
public class User {
    final Long id;
    final String username;
    final String email;
    String password;
    final Instant registrationDate;
}
