package TalkingPets;

public class Lion extends Pets{
    public Lion(String name) {
        super(name);
    }


    @Override
    public void speak() {

        System.out.println("roar");
    }
}
