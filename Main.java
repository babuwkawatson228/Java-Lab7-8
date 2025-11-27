public class Main {
    public static void main(String[] args) {
        Animal animal[] = new Animal[6];
        animal[0] = new Mammal("Lion", 5, 190, "Golden");
        animal[1] = new Dog("Rex", 3, 20, "Labrador", "Black");
        animal[2] = new Bird("Crow", 1, 2, "Black");
        animal[3] = new Pigeon("Stephan", 2, 1, "Rock Pigeon", "Gray");
        animal[4] = new Fish("Bubble", 1, 1, "Red");
        animal[5] = new Blowfish("Dori", 1, 1, "Blue","Spiky");

        System.out.println(" Animal voices");
        for (Animal a : animal) {
            System.out.println(a.getName() + ": " + a.getVoice());
        }

        System.out.println("Animals eating");
        for (Animal a : animal) {
            a.eat();
        }

        System.out.println("toString() output");
        for (Animal a : animal) {
            System.out.println(a);
        }

}