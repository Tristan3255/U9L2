public class Animal {

    private String name;
    private int age;
    private boolean vaccinated;
    private boolean hasFur;

    public Animal(String name, int age, boolean vaccinated, boolean hasFur){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.hasFur = hasFur;
    }


    public int getAge() {
        return age;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public boolean isHasFur() {
        return hasFur;
    }

    public String getName(){
        return name;
    }


    public void adopt(){
        System.out.println("I have been adopted");
    }

    public void feed(){
        System.out.println("I have been fed");
    }

    public void bathe(){
        System.out.println("I have been washed");
    }




}
