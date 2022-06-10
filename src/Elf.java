public class Elf implements Observer {
    private String name;
    private Observable board;
    private Toy createdToy;

    public Elf(String name) {
        this.name = name;
    }

    @Override
    public void update(String toyNeeded) {
        if (toyNeeded == "BIKE") {
            System.out.println(this.name + ": " + "Bike needed");
            this.createdToy = new BikeFactory().produceToy("BIKE");
        }
        if (toyNeeded == "DOLL") {
            System.out.println(this.name + ": " + "Doll needed");
            this.createdToy = new DollFactory().produceToy("DOLL");
        }
    }

    @Override
    public void setBoard(Observable board) {
        this.board = board;
    }
}
