package animal;

public class Animal {
    private String name;
    private int age;

    Animal() {

    }

    Animal(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void say() {
        System.out.println(this.name + "です。" + this.age + "歳です。");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
