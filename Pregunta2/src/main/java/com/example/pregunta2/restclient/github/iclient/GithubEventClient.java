package com.example.pregunta2.restclient.github.iclient;

import com.example.pregunta2.restclient.config.FeignConfig;
import com.example.pregunta2.restclient.github.model.GithubEventDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "githubEventClient",
        url = "https://api.github.com",
        configuration = FeignConfig.class)
public interface GithubEventClient {
    @GetMapping("/events")
    List<GithubEventDto> getEvents();
}
