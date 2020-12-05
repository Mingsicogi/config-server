package mins.study.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class GreetingController {

    @Value("${my.greeting:default value}")
    private String greetingMessage;

    @Value("${my.list.values}")
    private List<String> list;

    @Value("some static message")
    private String staticMessage;

    @Value("#{${db.value}}")
    private Map<String, String> dbConfig;

    @Resource
    private DBConfig dbConfigObj;

    @GetMapping("/greeting")
    public String greeting() {
        return greetingMessage + " | " + staticMessage + " | " + list.toString() + " | " + dbConfig.toString() + " | " + dbConfigObj.toString();
    }
}
