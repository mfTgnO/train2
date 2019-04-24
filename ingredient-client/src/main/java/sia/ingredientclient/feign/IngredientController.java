package sia.ingredientclient.feign;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Package: sia.ingredientclient.feign
 * @Author:
 * @Email:
 * @CreateDate: 2019-04-24 18:57
 * @Description:
 */
@Controller
@RequestMapping("/ingredients")
@Profile("feign")
@Slf4j
public class IngredientController {
    private IngredientClient client;
}
