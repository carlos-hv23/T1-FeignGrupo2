package pe.edu.cibertec.t1pregunta3.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.t1pregunta3.model.FakeUserDTO;

import java.util.List;

@FeignClient(
        name = "fakeUserClient",
        url = "https://fakestoreapi.com"
)
public interface FakeUserClient {
    @GetMapping("/users")
    List<FakeUserDTO> getUsers();

}
