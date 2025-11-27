public class Blowfish extends Fish implements AnimalMove, AnimalBehaviour{
    private String fishType;

    Blowfish(){
        super();
        fishType = "NoType";
    }
    public Blowfish(String name, int age, int weight, String scaleColor, String fishType){
        super(name, age, weight, scaleColor);
        this.fishType = fishType;
    }
    public Blowfish(int age, String scaleColor, String fishType) {
        super(age, scaleColor);
        this.fishType = fishType;
    }

    public void inflate() {
        System.out.println("Blowfish is inflating");
    }

    @Override
    public void eat(String foodName) {
        System.out.println("Blowfish is eating " + foodName);
    }

    @Override
    public void getVoice() {
        System.out.println("Blowfish makes sound");
    }

    public String getFishType() { return fishType; }
    public void setFishType(String fishType) { this.fishType = fishType; }

    @Override
    public String toString(){
        return "Blowfish{"+
                "fishType='" + fishType + '\'' +
                '}';
    }

    @Override
    public void sleep() {
        System.out.println("Blowfish is sleeping");
    }
    @Override
    public void move(Object obj) {
        System.out.println("Blowfish is moving");
    }
}


