package dubbo.consumer.analyze.service;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.service.api.DubboTest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * Created by xuejian.sun on 2018/9/30.
 */
@Slf4j
@Component
public class HelloService {

    @Reference(version = "0.1")
    DubboTest dubboTest;

    public void hello(){
        String callback = dubboTest.hello("i'm consumer,received please answer");
        log.info("{}",callback);
    }
}
