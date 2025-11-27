public class Dog extends Mammal implements AnimalMove, AnimalBehaviour {
    private String breed;

    Dog(){
        super();
        breed = "NoBreed";
    }
    public Dog(String name, int age, int weight, String breed, String furColor){
        super(name, age, weight, furColor);
        this.breed = breed;
    }
    public Dog(int age, String breed, String furColor) {
        super(age, furColor);
        this.breed = breed;
    }

    public void aport() {
        System.out.println("Dog is bringing the stick");
    }
    @Override
    public void getVoice() {
        System.out.println("Woof-Woof");
    }
    @Override
    public void eat(String foodName) {
        System.out.println("Dog is eating " + foodName);
    }
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString(){
        return "Dog{"+
                "breed='" + breed + '\'' +
                '}';
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
    @Override
    public void move(Object obj) {
        System.out.println("Dog is moving");
    }
}