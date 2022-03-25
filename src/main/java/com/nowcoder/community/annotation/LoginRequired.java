package com.nowcoder.community.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)  // 这个注解是用来描述方法的
@Retention(RetentionPolicy.RUNTIME) // 注解有效的实际，运行时有效
public @interface LoginRequired {

}
