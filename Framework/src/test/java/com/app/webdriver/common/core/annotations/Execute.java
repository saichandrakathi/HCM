package com.app.webdriver.common.core.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD, ElementType.TYPE})
public @interface Execute {

  //User asUser() default User.ANONYMOUS;

  String onWikia() default "";

  String disableFlash() default "";

  String mockAds() default "";

  String disableCommunityPageSalesPitchDialog() default "";

  String language() default "";

  boolean trackingOptIn() default true;

  boolean trackingOptOut() default false;

}
