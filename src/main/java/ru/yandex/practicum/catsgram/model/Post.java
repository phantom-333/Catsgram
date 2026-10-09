package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import java.time.Instant;

@NoArgsConstructor(force = true)
@Data
@EqualsAndHashCode(of = "id")
public class Post {
    Long id;
    @NonNull
    Long authorId;
    String description;
    Instant postDate;
}
