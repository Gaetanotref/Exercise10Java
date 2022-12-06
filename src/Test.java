public class Test {
    public static void main(String[] args) {
        //OBJECT CREATION
        Animal animal1= new Animal("Animal");
        Lion lion1 = new Lion("Leo");
        Cow cow1 = new Cow("Mary");
        //METHOD
        animal1.animalSound();
        lion1.animalSound();
        cow1.animalSound();
    }
}
