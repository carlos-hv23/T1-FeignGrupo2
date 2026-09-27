package com.example.pregunta2.service;

import com.example.pregunta2.restclient.github.iclient.GithubEventClient;
import com.example.pregunta2.restclient.github.model.GithubEventDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class GithubEventService {
    private final GithubEventClient githubEventClient;
    public List<GithubEventDto> getEvents() {
        return githubEventClient.getEvents().stream()
                .filter(event -> "PushEvent".equals(event.getType()))
                .filter(event -> event.getActor() != null
                        && event.getActor().getId() != null
                        && event.getActor().getId() % 2 != 0)
                .toList();
    }
}
