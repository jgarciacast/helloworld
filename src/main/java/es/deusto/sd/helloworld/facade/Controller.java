package es.deusto.sd.helloworld.facade;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    // Get hello world
    @GetMapping("/hello")
    public ResponseEntity<String> getHelloWorld() {        
        return new ResponseEntity<>("HelloWorld!!!", HttpStatus.OK);
    }

    // Post to say hello
    @PostMapping("/hello")
    public ResponseEntity<String> sayHello(@RequestBody String name) {
        return new ResponseEntity<>("Hello, " + name + "!", HttpStatus.OK);
    }

    // Post to say goodbye
    @PostMapping("/goodbye")
    public ResponseEntity<String> sayGoodbye(@RequestBody String name) {
        return new ResponseEntity<>("Goodbye, " + name + "!", HttpStatus.OK);
    }

}