package TalkingPets;

public class Cat extends Pets {
    public Cat(String name) {
        super(name);
    }

    public void speak() {

        System.out.println("meow");
    }

    public void scratch () {

        System.out.println("I am a cat, I scratch things");
    }
}
