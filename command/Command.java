package command;

/**
 * Abstract Class for a Command
 * Author Git Money
 */
public abstract class Command {
    protected Document document;

    /**
     * Constructor for a Command that initializes the document
     * @param document Document that will have commands called on it
     */
    public Command(Document document) {
        this.document = document;
    }

    /**
     * Method that will be implemented to execute various different commands
     * @return Returns a String corresponding to each command
     */
    public abstract String execute();

}
