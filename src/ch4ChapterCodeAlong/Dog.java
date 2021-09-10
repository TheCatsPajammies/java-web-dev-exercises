package ch4ChapterCodeAlong;

public class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;

    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Bernie", "beagle");
        System.out.println(myDog.name);
        System.out.println(myDog.breed);
    }


}
