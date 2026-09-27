package com.example.pregunta1.service;

import com.example.pregunta1.restclient.placeholder.iclient.AlbumClient;
import com.example.pregunta1.restclient.placeholder.model.AlbumsPlaceHolder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class AlbumService {
    private final AlbumClient albumClient;
    public List<AlbumsPlaceHolder> getAlbums() {
        return albumClient.getAlbums().stream()
                .filter(album -> album.getUserId() % 2 == 0)
                .filter(album -> album.getId() % 2 != 0)
                .toList();
    }
}
