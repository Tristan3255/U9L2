public class Cat extends Animal{

    private boolean hasPlayedWith;
    private boolean hasPurred;
    public Cat(String name, int age, boolean vaccinated,boolean hasFur, boolean hasPlayedWith, boolean hasPurred){
        super(name,age,vaccinated,hasFur);
        this.hasPlayedWith = hasPlayedWith;
        this.hasPurred = hasPurred;
    }


    public boolean isHasPlayedWith(){
        return hasPlayedWith;
    }

    public boolean isHasPurred(){
        return hasPurred;
    }


    public void play(){
        System.out.println("You have played with me");
    }

    public void purr(){
        System.out.println("I have purred");
    }
}
