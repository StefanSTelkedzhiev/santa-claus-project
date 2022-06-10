public class Bike extends Toy{
    public String type;

    public Bike(String type) {
        this.type = type;
    }

    @Override
    public void seeToy() {
        System.out.println("Bike of type " + this.type);
    }
}
