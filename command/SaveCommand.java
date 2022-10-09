package command;

public class SaveCommand extends Command {
    private Document document;
    public SaveCommand(Document doc) {
        super(doc);
        this.document = doc;
    }

    public String execute() {
        return this.document.save();
    }
}
