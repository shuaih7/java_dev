package general;


public class Genericity <T> {

    private T name;

    public static void main(String[] args) {
        Genericity.showStatic("Shuai");

        Genericity<String> gen = new Genericity<String>("Hao");
        gen.show();
        gen.showGeneral("Costa");
        String n = (String)gen.showParam("Villa");

        System.out.println("======================");
        PersonImpl person = new PersonImpl();
        String age = person.getAge("name");

        PersonGenImpl<String> personGen = new PersonGenImpl<String>();
        PersonGenImpl<Integer> personGen1 = new PersonGenImpl<Integer>();
        personGen.getAge("name");

        // 泛型不管传入的数据类型，其Class对象总是相等
        // Java中的父子关系，泛型中并不会认识到
        // 可以使用通配符<?>来表示所有类的父类
        // 可以使用<? extends T>代表可以传入T以及T的子类的类型
        // 可以使用<? super T>代表可以传入T以及T的父类的类型
        System.out.println(personGen.getClass()==personGen1.getClass());
    }

    public Genericity(){}

    public Genericity(T name){
        this.name = name;
    }

    public void show(){
        System.out.println("内部参数值为"+this.name);
    }

    // 一般泛型方法的数据类型T可以在类声明中定义
    public void showGeneral(T name){
        System.out.println("一般泛型方法输入值为"+name);
    }

    // 一般泛型方法的特殊数据类型E可以在方法前声明
    public <E> E showParam(E name){
        System.out.println("一般方法的特殊泛型输入为"+name);
        return name;
    }

    // 静态泛型方法的数据类型W和类中的泛型占位符没有关系
    public static <W> void showStatic(W name){
        System.out.println("静态泛型方法输入值为"+name);
    }

}


interface PersonInt<T> {
    public T getAge(T name);
    public String getNum(String num);
}


class PersonImpl implements PersonInt<String>{
    @Override
    public String getAge(String name){
        return name;
    }

    @Override
    public String getNum(String num){
        return num;
    }
}


class PersonGenImpl<T> implements PersonInt<T>{
    @Override
    public T getAge(T name){
        return name;
    }

    @Override
    public String getNum(String num){
        return num;
    }
}