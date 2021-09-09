package vitality.service.ins.order.ctrl;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: HealthExamination
 * @Description: 概况
 * @Author: huanghz
 * @Date: 2020/4/7 9:57
 */
@RequestMapping(path = "/")
@RestSchema(schemaId = "HealthExamination")
public class HealthExamination {
    @GetMapping(value = "/healthExamination", produces = "text/plain")
    public String healthExamination() {
        return "success";
    }
}
