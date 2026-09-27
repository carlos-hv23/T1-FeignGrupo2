package pe.edu.cibertec.t1pregunta3.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.t1pregunta3.model.FakeUserDTO;
import pe.edu.cibertec.t1pregunta3.service.FakeUserService;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class FakeUserController {

    private final FakeUserService fakeUserService;

    @GetMapping
    public List<FakeUserDTO> getUsers(){
        return fakeUserService.getUsers();
    }
}
