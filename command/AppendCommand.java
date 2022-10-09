package command;

import java.util.Scanner;

/*
 * Class for an Append Command
 * Author Git Money
 */
public class AppendCommand extends Command {
    private Scanner in = new Scanner(System.in);

    /**
     * Constructs an AppendCommand by calling the super
     * @param doc The Document to be appended to
     */
    public AppendCommand(Document doc) {
        super(doc);
    }

    /**
     * Method that calls the documents append and asks the user to input text for it
     * @return Returns a String that verified the document being appended
     */
    public String execute() {
        System.out.print("Enter Text: ");
        String input = in.nextLine();
        return this.document.append(input);
    }
}
