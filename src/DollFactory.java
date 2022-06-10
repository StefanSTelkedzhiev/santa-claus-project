public class DollFactory extends ToyFactory {
    @Override
    public Toy createToy(String toyNeeded) {
        if (toyNeeded == "DOLL") {
            return new Doll("yellow");
        } else {
            System.out.println("Doll factory cannot produce bike");
            return null;
        }
    }
}
