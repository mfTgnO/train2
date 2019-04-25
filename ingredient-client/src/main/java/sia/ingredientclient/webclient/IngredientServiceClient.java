package sia.ingredientclient.webclient;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import sia.ingredientclient.Ingredient;

/**
 * @Package: sia.ingredientclient.webclient
 * @Author:
 * @Email:
 * @CreateDate: 2019-04-25 10:32
 * @Description:
 */
@Service
@Profile("webclient")
public class IngredientServiceClient {
    private WebClient.Builder builder;

    public IngredientServiceClient(@LoadBalanced WebClient.Builder builder) {
        this.builder = builder;
    }

    public Mono<Ingredient> getIngredientById(String ingredientId) {
        return builder.build()
                .get()
                .uri("http://ingredient-service/ingredients/{id}", ingredientId)
                .retrieve().bodyToMono(Ingredient.class);
    }

    public Flux<Ingredient> getAllIngredients() {
        return builder.build()
                .get()
                .uri("http://ingredient-service/ingredients")
                .retrieve().bodyToFlux(Ingredient.class);
    }
}
