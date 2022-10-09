package command;

import java.util.HashMap;

/**
 * Class for an InputHandler
 * Author Git Money
 */
public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<String, Command>();

    /**
     * Constructs an InputHandler by populating a Hashmap with keys and the various commands
     * @param document Document that have commands used on it from the InputHandler
     */
    public InputHandler(Document document) {
        ViewCommand viewCommand = new ViewCommand(document);
        WriteCommand writeCommand = new WriteCommand(document);
        SaveCommand saveCommand = new SaveCommand(document);
        AppendCommand appendCommand = new AppendCommand(document);
        commands.put("view", viewCommand);
        commands.put("write", writeCommand);
        commands.put("save", saveCommand);
        commands.put("append", appendCommand);
    }

    /**
     * Method that executes on the command given from the user in the Driver
     * @param data Represents the key that will be used to get the users command
     */
    public void inputEntered(String data) {
        if (commands.containsKey(data)) {
            System.out.println((commands.get(data)).execute());
        }
    }
}
