package general;

public class ThrowTest {
    public static void main(String[] args) {
        ThrowTest test = new ThrowTest();
        test.setAge(28);
    }

    private User usr = new User("Shuai", 28);

    public void setAge(int age){
        usr.setAge(age);
    }
}

class User {
    private String name = "";
    private int age = 0;

    public User(){}

    public User(String name, int age){this.setName(name); this.setAge(age);}

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) throws IllegalArgumentException{
        if (age > 120 || age < 0){
            throw new IllegalArgumentException("非法年龄！");
        }
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}