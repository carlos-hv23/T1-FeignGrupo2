package com.example.pregunta2.restclient.errorhandler;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class CustomErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String s, Response response) {
        HttpStatus status = HttpStatus.valueOf(response.status());
        return switch (status) {
            case NOT_FOUND -> new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    "El recurso no fue encontrado");
            case BAD_REQUEST -> new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Solicitud incorrecta al API");
            case FORBIDDEN, TOO_MANY_REQUESTS -> new ResponseStatusException(
                    HttpStatus.TOO_MANY_REQUESTS,
                    "Se excedió el límite de peticiones al API de GitHub");
            default -> new ResponseStatusException(
                    HttpStatus.BAD_GATEWAY,
                    "Error al consumir el API externo");
        };
    }
}
