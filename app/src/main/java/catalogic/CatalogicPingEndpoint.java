package catalogic;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class CatalogicPingEndpoint {

    @GetMapping("/ping")
    public String ping() {
        return "PONG!";
    }
    

}
