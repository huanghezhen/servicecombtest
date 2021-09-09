package vitality.serve.ins.pay;

import org.apache.servicecomb.springboot2.starter.EnableServiceComb;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author : huanghz
 */
@EnableServiceComb
@SpringBootApplication
public class Pay {
    public static void main(String[] args) {
        new SpringApplicationBuilder().web(WebApplicationType.NONE).sources(Pay.class).run(args);
    }
}
