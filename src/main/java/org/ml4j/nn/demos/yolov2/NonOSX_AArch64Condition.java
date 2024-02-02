package org.ml4j.nn.demos.yolov2;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class NonOSX_AArch64Condition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        return (conditionContext.getEnvironment().getProperty("os.name").indexOf("OS X") == -1
                || conditionContext.getEnvironment().getProperty("os.arch").indexOf("aarch64") == -1);
    }
}
