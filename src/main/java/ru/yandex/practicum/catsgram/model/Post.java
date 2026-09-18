package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

import java.time.Instant;

@Data
@EqualsAndHashCode(of = "id")
public class Post {
    final Long id;
    @NonNull
    long authorId;
    String description;
    @NonNull
    Instant postDate;
}
