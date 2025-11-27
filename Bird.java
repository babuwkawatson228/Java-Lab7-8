public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        featherColor = "NoColor";
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(int age, String featherColor) {
        super(age);
        this.featherColor = featherColor;
    }
    public void fly() {
        System.out.println("Bird is flying");
    }


    @Override
    public void eat(String foodName) {
        System.out.println("Bird is eating " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Bird makes sound");
    }
    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    } 
}
