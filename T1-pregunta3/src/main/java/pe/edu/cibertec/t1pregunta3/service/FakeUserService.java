package pe.edu.cibertec.t1pregunta3.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.t1pregunta3.client.FakeUserClient;
import pe.edu.cibertec.t1pregunta3.model.FakeUserDTO;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FakeUserService {

    private final FakeUserClient fakeUserClient;

    public List<FakeUserDTO> getUsers(){
        return fakeUserClient.getUsers().stream()
                .filter(user -> user.getId() % 2 == 0)
                .filter(user -> user.getUsername().length()> 6)
                .toList();
    }

}
