public class Main {

    public static void main(String[] args) {
        Animal myAnimal = new Animal("Animale", 10, false, true);

        System.out.println(myAnimal.getName());
        System.out.println(myAnimal.getAge());
        System.out.println(myAnimal.isHasFur());
        System.out.println(myAnimal.isVaccinated());
        myAnimal.adopt();
        myAnimal.feed();
        myAnimal.bathe();

        System.out.println();

        Dog myDog = new Dog("Bob", 7, true, true, false, true);

        System.out.println(myDog.getName());
        System.out.println(myDog.getAge());
        System.out.println(myDog.isHasBarked());
        System.out.println(myDog.isVaccinated());
        System.out.println(myDog.isHasFur());
        System.out.println(myDog.ishasBeenWalked());
        myDog.bark();
        myDog.walk();

        System.out.println();

        Cat myCat = new Cat("Nob", 7, true, true, false, true);

        System.out.println(myCat.getName());
        System.out.println(myCat.getAge());
        System.out.println(myCat.isHasPurred());
        System.out.println(myCat.isVaccinated());
        System.out.println(myCat.isHasFur());
        System.out.println(myCat.isHasPlayedWith());
        myCat.play();
        myCat.purr();

    }
}
