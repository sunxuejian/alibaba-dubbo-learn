package dubbo.provide.analyze.service;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.service.api.DubboTest;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by xuejian.sun on 2018/9/30.
 */
@Slf4j
@Service(version = "0.1",
registry = "${dubbo.registry.id}",
        protocol = "${dubbo.protocol.id}",
        application = "${dubbo.application.id}")
@org.springframework.stereotype.Service
public class DubboTestImpl implements DubboTest {
    @Override
    public String hello(String param) {
        log.info("{}",param);
        return "hello,i received your message!";
    }
}
