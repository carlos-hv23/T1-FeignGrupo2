package com.example.pregunta2.controller;

import com.example.pregunta2.restclient.github.model.GithubEventDto;
import com.example.pregunta2.service.GithubEventService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/github-event-client")
@RestController
public class GithubEventController {
    private final GithubEventService githubEventService;

    //localhost:8080/api/v1/github-event-client
    @GetMapping
    public ResponseEntity<List<GithubEventDto>> getEvents() {
        return ResponseEntity.ok(githubEventService.getEvents());
    }
}
