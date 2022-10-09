package command;

import java.util.ArrayList;

public class Document {
    private String fileName;
    private ArrayList<String> lines = new ArrayList<String>();

    public Document(String fileName) {
        this.fileName = fileName;
        lines = FileManipulator.readFile(fileName);
    }

    public String view() {
        return viewLines();
    }

    public String viewLines(){
        String str = "";
        for(int i = 0; i<lines.size(); i++){
            str+=lines.get(i)+"\n";
        }
        return str;
    }

    public String append(String line) {
        lines.add(line);
        return "The line has been appended to the document";
    }

    // Clears out the arraylist to add in the new line written in the terminal.
    public String write(String line) {
        lines.clear();
        return "The line was written to the file";
    }

    // Only saves the file if FileManipulator returns true.
    public String save() {
        if(FileManipulator.writeFile(fileName, lines) == true) {
            return "The file has been saved";
        }
        else {
            return "Sorry, we cannot save at this time.";
        }
    }
}
