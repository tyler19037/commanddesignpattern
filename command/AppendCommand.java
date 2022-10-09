package command;

import java.util.Scanner;

public class AppendCommand extends Command {
    private Scanner in = new Scanner(System.in);

    public AppendCommand(Document doc) {
        super(doc);
    }

    public String execute() {
        System.out.println("Enter Text: ");
        String input = in.nextLine();
        return input;
    }
}
