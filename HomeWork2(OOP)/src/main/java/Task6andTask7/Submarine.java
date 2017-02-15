package Task6andTask7;

import java.lang.annotation.*;

@Documented
@Inherited
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Submarine {

    String name();

    boolean working() default  true;

}
