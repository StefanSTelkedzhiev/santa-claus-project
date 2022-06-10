public class AppMain {
    public static void main(String[] args) {
        Santa santa = Santa.getInstance();
        Board board = new Board();
        Elf elf1 = new Elf("Dobby");
        board.subscribe(elf1);
        Command iNeedBike = new INeedBike(board);
        Command iNeedDoll = new INeedDoll(board);

        santa.setCommand(iNeedBike);
        santa.sayWords();

        santa.setCommand(iNeedDoll);
        santa.sayWords();
    }
}
