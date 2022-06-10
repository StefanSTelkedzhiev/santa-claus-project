public class Santa {
    private Command command;
    private static Santa instance;

    private Santa () {}

    public static Santa getInstance(){
        if(instance == null){
            instance = new Santa();
        }

        return instance;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
    public void sayWords(){
        if(this.command==null){
            System.out.println("No magic words set");
            return;
        }
        this.command.execute();
    }
}
