package vitality.service.ins.order.service;

import lombok.RequiredArgsConstructor;
import org.apache.servicecomb.provider.pojo.RpcSchema;
import vitality.serve.model.Member;
import vitality.serve.rpc.id.OrderId;
import vitality.serve.rpc.iface.OrderRpc;

/**
 * @author : huanghz
 */
@RequiredArgsConstructor
@RpcSchema(schemaId = OrderId.DEMO)
public class OrderService implements OrderRpc {
    public Member demo(String param) {
        Member member = new Member();
        member.setMoney(0);
        member.setMychar('哈');
        member.setMoneyDouble(Double.NaN);
        member.setName("");
        return member;
    }
}
