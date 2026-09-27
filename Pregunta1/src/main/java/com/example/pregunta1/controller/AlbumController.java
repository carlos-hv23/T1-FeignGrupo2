package com.example.pregunta1.controller;

import com.example.pregunta1.restclient.placeholder.model.AlbumsPlaceHolder;
import com.example.pregunta1.service.AlbumService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/v1/album-client")
@RestController
public class AlbumController {
    private final AlbumService albumService;

    //localhost:8080/api/v1/album-client
    @GetMapping
    public ResponseEntity<List<AlbumsPlaceHolder>> getAlbums() {
        return ResponseEntity.ok(albumService.getAlbums());
    }
}
