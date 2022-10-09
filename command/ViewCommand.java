package command;

public class ViewCommand extends Command {
    private Document document;
    public ViewCommand(Document doc) {
        super(doc);
        this.document = doc;
    }

    public String execute() {
        return this.document.view();
    }
}
