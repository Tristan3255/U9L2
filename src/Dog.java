public class Dog extends Animal{

    private boolean hasBeenWalked;
    private boolean hasBarked;
    public Dog(String name, int age, boolean vaccinated, boolean hasFur, boolean hasBeenWalked, boolean hasBarked){
        super(name,age,vaccinated,hasFur);
        this.hasBeenWalked = hasBeenWalked;
        this.hasBarked = hasBarked;
    }

    public boolean ishasBeenWalked(){
        return hasBeenWalked;
    }

    public boolean isHasBarked() {
        return hasBarked;
    }

    public void walk(){
        System.out.println("I have been walked");

    }

    public void bark(){
        System.out.println("I have barked");
    }


}
