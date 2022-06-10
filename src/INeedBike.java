public class INeedBike implements Command {
    private Observable board;

    public INeedBike(Observable board) {
        this.board = board;
    }

    @Override
    public void execute() {
        System.out.println("Santa says BIKE");
        this.board.setToyNeeded("BIKE");
    }
}
