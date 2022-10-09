package command;

import java.util.ArrayList;

/**
 * Class for a Document
 * Author Git Money
 */
public class Document {
    private String fileName;
    private ArrayList<String> lines = new ArrayList<String>();

    /**
     * Constructs a Document by initializing the filesName and reading those lines to an array
     * @param fileName Represents the file that will be read with the fileManipulator
     */
    public Document(String fileName) {
        this.fileName = fileName;
        lines = FileManipulator.readFile(fileName);
    }

    /**
     * Method that traverses the lines and displays them in a document format
     * @return Returns a String containing the document in a viewable format
     */
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

    /**
     * Method that adds the line given to the lines ArrayList
     * @param line Represents the line given by the user
     * @return Returns a string verifying that the line was appended
     */
    public String append(String line) {
        lines.add(line);
        return "The line has been appended to the document";
    }

    /**
     * Method that overwrites the lines and adds the new line to the ArrayList
     * @param line Represents the line given by the user
     * @return Returns a string verifying that the line was written
     */
    public String write(String line) {
        lines.clear();
        lines.add(line);
        return "The line was written to the file";
    }

    /**
     * Method that returns whether or not the file could be saved with the lines
     * @return Returns a String that either states it could be saved or not
     */
    public String save() {
        if(FileManipulator.writeFile(fileName, lines) == true) {
            return "The file has been saved";
        }
        else {
            return "Sorry, we cannot save at this time.";
        }
    }
}
