package Objectclass;

public class SetterGetterProgram {
    String name;
    int age;
    String breed;
    String color;

    public SetterGetterProgram(String name, int age, String breed, String color){
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getBreed(){
        return breed;
    }

    public String getColor(){
        return color;
    }

    public String toString(){
        return ("Name is " + this.getName() + "\nBreed, age and color are " + this.getBreed() + ", " + this.getAge() + ", " + this.getColor());
    }


    static void main(String[] args) {
        SetterGetterProgram dog = new SetterGetterProgram("Tuffy", 5, "Papiliion", "White");
        System.out.println(dog.toString());
    }
}
