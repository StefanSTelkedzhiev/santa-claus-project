public class INeedDoll implements Command {
    private Observable board;

    public INeedDoll(Observable board) {
        this.board = board;
    }

    @Override
    public void execute() {
        System.out.println("Santa says DOLL");
        this.board.setToyNeeded("DOLL");
    }
}
