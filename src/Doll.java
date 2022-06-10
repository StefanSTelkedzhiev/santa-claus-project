public class Doll extends Toy{
    public String hairColor;

    public Doll(String hairColor) {
        this.hairColor = hairColor;
    }

    @Override
    public void seeToy() {
        System.out.println("Doll with " + this.hairColor + " hair");
    }
}
