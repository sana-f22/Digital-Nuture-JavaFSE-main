import java.lang.reflect.*;

class Sample {
    public void show() {
        System.out.println("Hello");
    }
}

public class ReflectionDemo {

    public static void main(String[] args) throws Exception {

        Class<?> cls = Class.forName("Sample");

        Method[] methods = cls.getDeclaredMethods();

        for(Method m : methods) {
            System.out.println(m.getName());
        }

        Object obj = cls.getDeclaredConstructor().newInstance();

        Method method = cls.getMethod("show");

        method.invoke(obj);
    }
}