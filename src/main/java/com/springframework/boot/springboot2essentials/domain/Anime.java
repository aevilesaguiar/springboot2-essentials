package com.springframework.boot.springboot2essentials.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Anime {

    private String name;

    public Anime() {

    }

    public Anime(String name) {
        this.name = name;
    }
}
