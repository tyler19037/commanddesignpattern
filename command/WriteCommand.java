package command;

import java.util.Scanner;

public class WriteCommand extends Command{
    private Scanner in = new Scanner(System.in);

    public WriteCommand(Document doc) {
        super(doc);
    }

    public String execute() {
        return "";
    }
}