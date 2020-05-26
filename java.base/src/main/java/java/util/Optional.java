package java.util;

import github.lightningcreations.lccc.markers.*;
import jdk.internal.invoke.Stable;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

@SuppressWarnings("OptionalAssignedToNull")
@LangItemInject("option")
public class Optional<T> {

    @DynamicBootstrap
    @NativeInject("option_bootstrap") // If running lcjvm, replace the bytecode definition with the internal native
    @LangItemInject("option_bootstrap") // Also bind invokevirtuals
    private static CallSite __option_bootstrap(MethodHandles.Lookup lookup, String name, MethodType type){
        try {
            return new ConstantCallSite(lookup.findVirtual(Optional.class,name,type));
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new BootstrapMethodError("Panic",e);
        }
    }

    @LangItemInject("none_option")
    @Stable
    private static Optional<?> __none_option;
    private final T __value;

    private Optional(T __value){
        this.__value = __value;
    }

    @SuppressWarnings("unchecked")
    public static <T> Optional<T> empty(){
        if(__none_option==null){
            // If this code path is taken,
            __none_option = new Optional<T>(null);
        }
        return (Optional<T>) __none_option;
    }


    @ReplaceWithDynamic
    public boolean isPresent(){
        return this!=__none_option;
    }

    @ReplaceWithDynamic
    public @Optimize("nonnull") T get(){
        if(this!=__none_option)
            return __value;
        else
            throw new NoSuchElementException("Optional is Empty");
    }
}
