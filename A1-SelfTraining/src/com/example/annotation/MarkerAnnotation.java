package com.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //tells the compiler /runtime processor when to execute the annotationi.e , when the annotation is active
@Target(ElementType.TYPE) //tells the compiler/ runtime what annotation type is applied upon i.e target audience for the annotation
public @interface MarkerAnnotation {

}
