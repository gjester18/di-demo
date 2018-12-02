package guru.springframework.config;

import guru.springframework.ExampleBeans.FakeDatasource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {



    @Value("${jbg.username}")
     String username;

    @Value("${jbg.password}")
     String password;

    @Value("${jbg.url}")
     String url;


    @Bean
    public FakeDatasource datasource(){
        FakeDatasource fds = new FakeDatasource();
        fds.setUsernmae(username);
        fds.setPassword(password);
        fds.setUrl(url);
        return fds;
    }


}
