package io.api.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClientController {

    @GetMapping(value = "/clients", produces = {"application/json"}, consumes = {MediaType.ALL_VALUE})
    @ResponseBody
    public List<Client> listClients() {
        return Arrays.asList(new Client("Cassio", 36), new Client("Sofia", 3));
    }

    @GetMapping(value = "/client/{id}")
    @ResponseBody
    public Client getClient(@PathVariable int id) {
        return new Client("client with id:" + id, 20);
    }

}
