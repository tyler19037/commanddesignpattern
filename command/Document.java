package command;

import java.util.ArrayList;

public class Document {
    private String fileName;
    private ArrayList<String> lines = new ArrayList<String>();

    public Document(String fileName) {
        this.fileName = fileName;
    }

    public String view() {
        return "";
    }

    public String append(String line) {
        return "The line has been appended to the document";
    }

    public String write(String line) {
        return "The line was written to the file";
    }

    public String save() {
        if(FileManipulator.writeFile(fileName, lines) == true) {
            return "The file has been saved";
        }
        else {
            return "Sorry, we cannot save at this time.";
        }
    }
}
