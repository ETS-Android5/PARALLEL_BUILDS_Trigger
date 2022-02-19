package testannotations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(
{ TYPE, FIELD, METHOD, PARAMETER })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface InheritedAnnotation
{

}
