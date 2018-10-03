package dubbo.consumer.analyze;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import dubbo.consumer.analyze.service.HelloService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Created by xuejian.sun on 2018/9/30.
 */
@EnableDubbo
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = new SpringApplicationBuilder(ConsumerApplication.class).web(WebApplicationType.NONE).run(args);
        HelloService bean = run.getBean(HelloService.class);
        bean.hello();
    }
}
