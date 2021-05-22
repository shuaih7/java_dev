package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> c1 = Class.forName("reflection.User");
        Class<?> c2 = Class.forName("reflection.User");

        // c1 和 c2 的Hash值相等 - 一个类在内存中只有一个Class对象
        System.out.println("============================");
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        User usr1 = new User();
        User usr2 = new User();
        // new 的两个对象的Hash值不相等
        System.out.println(usr1.hashCode());
        System.out.println(usr2.hashCode());

        // 另外三种获取Class的方式
        System.out.println("============================");
        Class u1 = usr1.getClass();
        Class u2 = User.class;
        Class usuper = u1.getSuperclass();
        System.out.println(u1.hashCode());
        System.out.println(u2.hashCode());
        System.out.println(usuper);

        // 获取类的属性和方法
        System.out.println("============================");
        Field[] fields = u1.getFields();
        for (Field field : fields) {  // 仅打印public属性
            System.out.println(field);
        }
        Field[] fs = u1.getDeclaredFields();
        for (Field field : fs) {  // 打印所有属性
            System.out.println(field);
        }

        Method[] methods = u1.getMethods();  // 获得本类和父类的public方法
        Method[] ms = u1.getDeclaredMethods();  // 获得本类的所有方法

        // 通过反射创建一个对象
        System.out.println("============================");
        Class u3 = Class.forName("reflection.User");
        User user = (User)u3.newInstance(); // 调用了User的无参构造器
        System.out.println(user.getClass());
    }
}

class User {
    private int age = 0;
    private String name = "";
    private float score = 0.0f;

    public User(){}

    public User(String name, int age, float score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public float getScore(){
        return this.score;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setScore(float score){
        this.score = score;
    }
}
