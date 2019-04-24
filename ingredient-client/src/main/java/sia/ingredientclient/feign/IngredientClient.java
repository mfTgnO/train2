package sia.ingredientclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import sia.ingredientclient.Ingredient;

/**
 * @Package: sia.ingredientclient.feign
 * @Author:
 * @Email:
 * @CreateDate: 2019-04-24 18:55
 * @Description:
 */
@FeignClient("ingredient-service")
public class IngredientClient {
    @GetMapping("/ingredients/{id}")
    Ingredient getIngredient(@PathVariable("id") String id);

    @GetMapping("ingredients")
    Iterable<Ingredient> getAllIngredients();
}
