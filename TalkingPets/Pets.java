package TalkingPets;

public abstract class Pets {

    private String name;

    public String speak;



    public Pets(String nameOfPet) {
        this.name = nameOfPet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpeak() {
        return speak;
    }

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                ", speak='" + getSpeak() + '\'' +
                '}';
    }

    public abstract void speak();
}
