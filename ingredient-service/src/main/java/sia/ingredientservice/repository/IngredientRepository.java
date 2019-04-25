package sia.ingredientservice.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import sia.ingredientservice.domain.Ingredient;

/**
 * @Package: sia.ingredientservice.repository
 * @Author:
 * @Email:
 * @CreateDate: 2019-04-25 10:56
 * @Description:
 */
@CrossOrigin(origins = "*")
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
