package HomeWorkFinal.Models;

public class WildAnimalsCommands {

    public String commands;

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    public WildAnimalsCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Животное умеет: " + commands;
    }
}
