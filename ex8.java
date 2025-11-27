public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Lion", 5, 190, "Golden");
        animal[1] = new Dog("Rex", 3, 20, "Labrador", "Black");
        animal[2] = new Bird("Crow", 1, 2, "Black");
        animal[3] = new Pigeon("Stephan", 2, 1, "Rock Pigeon", "Gray");
        animal[4] = new Fish("Bubble", 1, 1, "Red");
        animal[5] = new Blowfish("Dori", 1, 1, "Blue","Spiky");

        AnimalBehaviour behaviour[] = new AnimalBehaviour[3];
        behaviour[0] = new Dog("Rex", 3, 20, "Labrador", "Black");
        behaviour[1] = new Pigeon("Stephan", 2, 1, "Rock Pigeon", "Gray");
        behaviour[2] = new Blowfish("Dori", 1, 1, "Blue","Spiky");  

        AnimalBehaviour[0].sleep();
        AnimalBehaviour[1].sleep();
        AnimalBehaviour[2].sleep();

        for(Animal a : animal){
            a.move(a);
        }

        for(Animal animal1 : animal){
            AnimalName.name(animal1.getName());
        }
    
}
}
