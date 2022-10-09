package command;

/**
 * Class for a View Command
 * Author Git Money
 */
public class ViewCommand extends Command {
    /**
     * Constructs a View Command by calling the super with doc
     * @param doc Document that will be viewed by the user
     */
    public ViewCommand(Document doc) {
        super(doc);
    }

    /**
     * Method that calls the documents view method
     * @return Returns a string that contains the document in viewable format
     */
    public String execute() {
        return this.document.view();
    }
}
