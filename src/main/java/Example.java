//java Custom Annotations

import java.lang.reflect.Method;

public class Example {

    public static void main(String args[]) throws NoSuchMethodException {
        Hello hello = new Hello();
        Method m = hello.getClass().getMethod("sayHello");
        MyAnnotation myAnnotation = m.getAnnotation(MyAnnotation.class);
        System.out.println(myAnnotation.value());
    }

}
