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
        String str = "";
        int longestLineLength = 0;
        if (lines.size() > 0) {
            longestLineLength = lines.get(0).length();
        }
        for(int i = 0; i<lines.size() - 1; i++){
            if (lines.size() >= 1 && lines.get(i).length() < lines.get(i+1).length()) {
                longestLineLength = lines.get(i+1).length();
            }
        }
        str += "______";
        for (int i = 0; i < longestLineLength; i++) {
            str += "_";
        }
        str += "____" + "\n" + "\n";
        for(int i = 0; i<lines.size(); i++){
            str += "|     ";
            str+=lines.get(i);
            int tempLineLength = longestLineLength - lines.get(i).length();
            for (int j = 0; j < tempLineLength; j++) {
                str += " ";
            }
            str += "     |" + "\n";
        }
        str += "______";
        for (int i = 0; i < longestLineLength; i++) {
            str += "_";
        }
        str += "____";
        return str;
    }

    public String append(String line) {
        lines.add(line);
        return "The line has been appended to the document";
    }

    // Clears out the arraylist to add in the new line written in the terminal.
    public String write(String line) {
        lines.clear();
        lines.add(line);
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
