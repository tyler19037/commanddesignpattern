package command;

/**
 * Class for a Save Command
 * Author Git Money
 */
public class SaveCommand extends Command {
    /**
     * Constructs a Save Command by calling the super constructor with doc
     * @param doc Documents that will be getting saved
     */
    public SaveCommand(Document doc) {
        super(doc);
    }

    /**
     * Method that calls the documents save command
     * @return Returns a string that verifies whether or not the document was saved
     */
    public String execute() {
        return this.document.save();
    }
}
