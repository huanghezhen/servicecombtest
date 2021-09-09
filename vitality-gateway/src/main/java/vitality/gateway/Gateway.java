package vitality.gateway;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author : huanghz
 */
@EnableServiceComb
@SpringBootApplication
public class Gateway {
    public static void main(String[] args) {
        new SpringApplicationBuilder().web(WebApplicationType.NONE).sources(Gateway.class).run(args);
    }
}
