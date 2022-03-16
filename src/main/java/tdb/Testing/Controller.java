package tdb.Testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private Serviceclass serviceclass;
    @GetMapping("/home")
    public String getHome(){
        return serviceclass.message();
    }
}
