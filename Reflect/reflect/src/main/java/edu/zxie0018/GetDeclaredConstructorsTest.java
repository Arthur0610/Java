package edu.zxie0018;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class GetDeclaredConstructorsTest {
    public static void main(String[] args) {
        Test test = new Test();
        Class<? extends Test> testClass = test.getClass();
        Constructor<?>[] testConstructors = testClass.getDeclaredConstructors();

        for(Constructor cons : testConstructors) {
            System.out.print(Modifier.toString(cons.getModifiers()) + " parameter(s): ");
            Class[] parameterTypes = cons.getParameterTypes();
            for(Class c : parameterTypes) {
                System.out.print(c.getName() + " ");
            }
            System.out.println("");
        }
    }
}
