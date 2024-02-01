package HomeWorkFinalV2.Models;

public abstract class AnimalsV2 {
    String name;
    String commands;

    public AnimalsV2(String name, String commands) {
        this.name = name;
        this.commands = commands;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", commands='" + commands + '\'' +
                '}';
    }
}
