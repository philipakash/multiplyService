import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class calc {

    @RequestMapping(value="/multiply/{a}")
    int add(@PathVariable("a") int a) {
    	return 10*a;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(calc.class, args);
    }

}