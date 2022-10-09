package command;

import java.util.Scanner;

/**
 * Class for a Write Command
 * Author Git Money
 */
public class WriteCommand extends Command{
    private Scanner in = new Scanner(System.in);

    /**
     * Constructs a Write Command by calling the super with the doc
     * @param doc The Document that will be written on
     */
    public WriteCommand(Document doc) {
        super(doc);
    }

    /**
     * Calls the documents write method using the user input
     * @return Returns a String verifying that the Document was written to
     */
    public String execute() {
        System.out.print("Enter Text: ");
        String input = in.nextLine();
        return this.document.write(input);
    }
}
