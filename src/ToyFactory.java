public abstract class ToyFactory {

    public abstract Toy createToy(String toyNeeded);

    public Toy produceToy(String toyNeeded) {
        Toy toy = createToy(toyNeeded);
        toy.seeToy();
        return toy;
    }
}
