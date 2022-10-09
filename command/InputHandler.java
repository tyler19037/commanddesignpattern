package command;

import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<String, Command>();

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

    public void inputEntered(String data) {
        if (commands.containsKey(data)) {
            System.out.println((commands.get(data)).execute());
        }
    }
}
