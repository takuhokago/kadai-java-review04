package animal;

public class Review04 {

    public static void main(String[] args) {

        Human[] humans = new Human[3];

        humans[0] = new Human("田中　太郎", 25, "電車");
        humans[1] = new Human("鈴木　次郎", 30, "野球");
        humans[2] = new Human("佐藤　花子", 20, "映画");

        for (Human human : humans) {
            human.say();
            human.think();
        }

    }

}
