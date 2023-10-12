package lk.ijse.file_uploading.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackageClasses = {})
public class WebAppConfig {
    public WebAppConfig(){
        System.out.println("WebAppConfig: Instantiated");
    }
}