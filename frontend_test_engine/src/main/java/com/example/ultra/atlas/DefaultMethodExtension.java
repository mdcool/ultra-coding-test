package com.example.ultra.atlas;

import io.qameta.atlas.core.api.MethodExtension;
import io.qameta.atlas.core.internal.Configuration;
import io.qameta.atlas.core.util.MethodInfo;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

/**
 * Default method extension.
 * <br>
 * comment by dmardari: whole class copied here to properly override it for migration to newer java version
 */
public class DefaultMethodExtension implements MethodExtension {

    @Override
    public boolean test(final Method method) {
        return method.isDefault();
    }

    // fix suggested in comments here https://github.com/qameta/atlas/issues/104
    @Override
    public Object invoke(final Object proxy, final MethodInfo methodInfo, final Configuration config) throws Throwable {
        return MethodHandles.lookup()
                .unreflectSpecial(methodInfo.getMethod(), methodInfo.getMethod().getDeclaringClass())
                .bindTo(proxy)
                .invokeWithArguments(methodInfo.getArgs());
    }
}
