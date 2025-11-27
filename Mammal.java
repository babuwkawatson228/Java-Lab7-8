public class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        super();
        furColor = "NoColor";
    }

    public Mammal(String name, int age, int weight,String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(int age,String furColor) {
        super(age);
        this.furColor = furColor;
    }
    public void walk() {
        System.out.println("Mammal is walking");
    }
    @Override
    public void eat(String foodName) {
        System.out.println("Mammal is eating " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Mammal makes sound");
    }
    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
       return "Mammal{" +
                "furColor='" + furColor + '\'' +
                '}';
    }
}
