package HomeWorkFinal.Models;

public class WildAnimalsNames extends Animals{

    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WildAnimalsNames(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Тип животного: " + name;
    }
}
