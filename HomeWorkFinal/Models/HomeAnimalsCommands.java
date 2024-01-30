package HomeWorkFinal.Models;

public class HomeAnimalsCommands extends Animals{

    public String commands;

    public HomeAnimalsCommands(String commands) {
        this.commands = commands;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Животное умеет: " + commands;
    }
}
