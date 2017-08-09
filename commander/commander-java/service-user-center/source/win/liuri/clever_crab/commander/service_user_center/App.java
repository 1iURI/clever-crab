package win.liuri.clever_crab.commander.service_user_center;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/sign-in")
    public Object home(@RequestParam String name) {
        Map<String, String> result = new HashMap<>();
        result.put("result", "hello " + name);
        return result;
    }

}
