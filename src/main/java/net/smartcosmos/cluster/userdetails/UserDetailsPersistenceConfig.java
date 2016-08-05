package net.smartcosmos.cluster.userdetails;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@EnableJpaAuditing
@EntityScan
@ComponentScan
@Configuration
public class UserDetailsPersistenceConfig extends WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter {
    
}
