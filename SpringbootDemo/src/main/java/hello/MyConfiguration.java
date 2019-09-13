package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MyConfiguration  {

    @Bean
    Greeting greeting(){
        return new Greeting(888,"kiwi");

    }

}

