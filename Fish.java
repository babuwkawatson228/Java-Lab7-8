public class Fish extends Animal{
    private String scaleColor;


    public Fish() {
        super();
        scaleColor = "NoColor";
    }

    public Fish(String name, int age, int weight,String scaleColor) {
        super(name, age, weight);
        this.scaleColor = scaleColor;
    }

    public Fish(int age,String scaleColor) {
        super(age);
        this.scaleColor = scaleColor;
    }
    public void swim() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Fish is eating " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Fish makes sound");
    }
    public String getScaleColor() { return scaleColor; }
    public void setScaleColor(String scaleColor) { this.scaleColor = scaleColor; }

    @Override
    public String toString(){
        return "Fish{"+
                "scaleColor='" + scaleColor + '\'' +
                '}';
    }
}
