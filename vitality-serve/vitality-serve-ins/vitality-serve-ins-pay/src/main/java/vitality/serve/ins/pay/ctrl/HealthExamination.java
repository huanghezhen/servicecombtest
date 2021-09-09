package vitality.serve.ins.pay.ctrl;

import org.apache.servicecomb.provider.pojo.RpcReference;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import vitality.serve.core.MicroserviceName;
import vitality.serve.core.util.MyJsonUtils;
import vitality.serve.model.Member;
import vitality.serve.rpc.id.OrderId;
import vitality.serve.rpc.iface.OrderRpc;

/**
 * @ClassName: HealthExamination
 * @Description: 概况
 * @Author: huanghz
 * @Date: 2020/4/7 9:57
 */
@RequestMapping(path = "/")
@RestSchema(schemaId = "HealthExamination")
public class HealthExamination {
    @RpcReference(microserviceName = MicroserviceName.ORDER, schemaId = OrderId.DEMO)
    private OrderRpc orderRpc;


    @GetMapping(value = "/healthExamination", produces = "text/plain")
    public String healthExamination() {
        return "success";
    }

    @GetMapping(value = "/demo")
    public Member demo() {
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("111111111111111");
        Member hhhh = orderRpc.demo("hhhh");
        System.out.println(MyJsonUtils.objectToString(hhhh));
        return hhhh;
    }
}
