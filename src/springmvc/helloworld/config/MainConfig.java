package springmvc.helloworld.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "springmvc.helloworld")
//value指定要扫描的包，excludeFilters排除那些组建
//includeFilters //指定需要扫描的，useDefaultFilters需要为fales，不使用默认的扫描规则
public class MainConfig {
}
