package TalkingPets;


import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {


    public Zoo(String typeOfPet, String nameOfPet) {

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner((System.in));
        ArrayList<Pets> pets = new ArrayList<>();

        while (true){

            System.out.println("How many pets do you have? or enter 0 to exit");

            int numberOfPets = scanner.nextInt();
            if (numberOfPets == 0) {
                break;
            }
            scanner.nextLine();
            System.out.println("What kind of pets are they");
            System.out.println("1. Dog, 2. Cat, 3. Lion");
            String typeOfPet = scanner.nextLine();
            System.out.println("What is the name of the pet?");
            String name = scanner.nextLine();

            if (typeOfPet.equals("1")){
                pets.add(new Dog(name));
            } else if (typeOfPet.equals(("2"))){
                pets.add(new Cat(name));
            } else if (typeOfPet.equals(("3"))){
                pets.add(new Lion(name));
            } else {
                System.out.println("Try again");
            }

        }

        System.out.println(pets);





//        Dog rocky = new Dog();
//        rocky.fetch();
//        rocky.speak();
//        feed(rocky);
//
//        Lion simba = new Lion();
//        simba.setName("simba");
//        simba.speak();
//
//        Pets sasha = new Dog();
//        sasha.speak();
//        feed(sasha);
//        sasha = new Cat();
//        sasha.speak();
//        ((Cat) sasha).scratch();
//        feed(sasha);
//    }
//
//        public static void feed(Pets animal) {
//            if (animal instanceof Dog) {
//                System.out.println("Here is your Dog phone");
//            } else if (animal instanceof Cat) {
//                System.out.println("Here is your Cat food");
//            } else {
//                System.out.println("Here is your food");
//            }
        }


}
