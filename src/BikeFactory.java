public class BikeFactory extends ToyFactory {
    @Override
    public Toy createToy(String toyNeeded) {
        if (toyNeeded == "BIKE") {
            return new Bike("Mountain bike");
        } else {
            System.out.println("Bike factory cannot produce dolls");
            return null;
        }
    }
}
