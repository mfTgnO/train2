package sia.ingredientclient;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @Package: sia.ingredientclient
 * @Author:
 * @Email:
 * @CreateDate: 2019-04-24 18:51
 * @Description:
 */
@Data
@RequiredArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Ingredient {
    private final String id;
    private final String name;
    private final Type type;

    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}