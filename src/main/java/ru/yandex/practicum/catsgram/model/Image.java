package ru.yandex.practicum.catsgram.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NonNull;

@Data
@EqualsAndHashCode(of = "id")
public class Image {
    final Long id;
    @NonNull
    long postId;
    String originalFileName;
    String filePath;
}
