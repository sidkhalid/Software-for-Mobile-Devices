public class HelloWorld{

     public static void main(String []args){
        Animal deer=new Herbivores("Deer");
        deer.printName();
        deer.printNature();
        Animal lion = new Carnivores("Lion");
        lion.printName();
        lion.printNature();
       // System.out.println("no of animals "+Animal.AnimalsAvailable);
     }
}
abstract class Animal{
    String name;
    public static int AnimalsAvailable=0;
    Animal(String n){
        name=n;
        AnimalsAvailable++;
    }
    void printName(){
        System.out.println(name+" is an animal");
    }
    abstract void printNature();
}
class Herbivores extends Animal implements InterfaceOne{
    Herbivores(String n){
        super(n);
    }
    void printNature(){
        System.out.println("it's vegitarian");
    }
    public void IsDangerous(){
        System.out.println("no! there is no danger");
    }
}
class Carnivores extends Animal implements InterfaceOne{
    Carnivores(String n){
        super(n);
    }
    void printNature(){
        System.out.println("this animal eats flesh");
    }
    public void IsDangerous(){
        System.out.println("yes! danger");
    }
}
interface InterfaceOne{
    void IsDangerous();
}
