package sia.ingredientclient.resttemplate;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sia.ingredientclient.Ingredient;

import java.util.Arrays;

/**
 * @Package: sia.ingredientclient.resttemplate
 * @Author:
 * @Email:
 * @CreateDate: 2019-04-25 10:06
 * @Description:
 */
@Service
@Conditional(NotFeignAndNotWebClientCondition.class)
public class IngredientServiceClient {
    private RestTemplate rest;

    public IngredientServiceClient(@LoadBalanced RestTemplate rest) {
        this.rest = rest;
    }

    public Ingredient getIngredientById(String ingredientId) {
        return rest.getForObject("http://ingredient-service/ingredients/{id}", Ingredient.class, ingredientId);
    }

    public Iterable<Ingredient> getAllIngredients() {
        Ingredient[] ingredients = rest.getForObject("http://ingredient-service/ingredients", Ingredient[].class);
        return Arrays.asList(ingredients);
    }
}
