package fr.flegac.story;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({
  ElementType.TYPE
})
public @interface Epic {
  String what();

  String who();

  String why();

}