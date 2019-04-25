package sia.ingredientclient.resttemplate;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Package: sia.ingredientclient.resttemplate
 * @Author:
 * @Email:
 * @CreateDate: 2019-04-25 10:07
 * @Description:
 */
public class NotFeignAndNotWebClientCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return !context.getEnvironment().acceptsProfiles("feign")
                && !context.getEnvironment().acceptsProfiles("webclient");
    }
}
