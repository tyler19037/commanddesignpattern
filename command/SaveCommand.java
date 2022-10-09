package command;

public class SaveCommand extends Command {
    private Document document;
    public SaveCommand(Document doc) {
        super(doc);
        this.document = doc;
    }

    public String execute() {
        System.out.println(this.document.save());
        
        return this.document.save();
    }
}
