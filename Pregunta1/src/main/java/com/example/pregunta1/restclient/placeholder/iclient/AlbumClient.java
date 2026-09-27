package com.example.pregunta1.restclient.placeholder.iclient;

import com.example.pregunta1.restclient.config.FeignConfig;
import com.example.pregunta1.restclient.placeholder.model.AlbumsPlaceHolder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "albumClient",
        url = "https://jsonplaceholder.typicode.com",
        configuration = FeignConfig.class)
public interface AlbumClient {
    @GetMapping("/albums")
    List<AlbumsPlaceHolder> getAlbums();
}
