package com.example.pregunta2.restclient.github.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GithubEventDto {
    private String id;
    private String type;
    private ActorDto actor;
}
