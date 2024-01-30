package HomeWorkFinal.Models;

public class HomeAnimalsNames extends Animals{

    public String name;

    public HomeAnimalsNames(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Тип животного: " + name;
    }
}
