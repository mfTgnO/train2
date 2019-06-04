package sia.ingredientclient.webclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.reactive.function.client.WebClient;

/**
 * @Package: sia.ingredientclient.webclient
 * @Author:
 * @Email:
 * @CreateDate: 2019-04-25 10:30
 * @Description:
 */
@Configuration
@Profile("webclient")
@Slf4j
public class WebClientConfig {
    @Bean
    @LoadBalanced
    public WebClient.Builder webClientBuilder() {
        return WebClient.builder();
    }

    @Bean
    public CommandLineRunner startup() {
        return args -> {
            log.info("**************************************");
            log.info("     Configuring with WebClient");
            log.info("**************************************");
        };
    }
}