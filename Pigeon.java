public class Pigeon extends Bird implements AnimalMove, AnimalBehaviour {
    private String species;
    Pigeon(){
        super();
        species = "NoSpecies";
    }
    public Pigeon(String name, int age, int weight, String species, String featherColor) {
        super(name, age, weight, species);
        this.species = species;
    }
    public Pigeon(int age, String species, String featherColor) {
        super(age, species);
        this.species = species;
    }
    public void coo() {
        System.out.println("Pigeon is cooing");
    }
    @Override
    public void eat(String foodName) {
        System.out.println("Pigeon is eating " + foodName);
    }
    @Override
    public void getVoice() {
        System.out.println("Pigeon makes sound");
    }
    public String getspecies() { return species; }
    public void setspecies(String species) { this.species = species; }
    
    @Override
    public String toString(){
        return "Pigeon{"+
                "species='" + species + '\'' +
                '}';
    }
    @Override
    public void sleep() {
        System.out.println("Pigeon is sleeping");
    }
    @Override
    public void move(Object obj) {
        System.out.println("Pigeon is moving");
    }
}