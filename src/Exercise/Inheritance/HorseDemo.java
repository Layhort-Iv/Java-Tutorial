package Exercise.Inheritance;

class Horse{
    private String name, color;
    private int birthYear;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getBirthYear() {
        return birthYear;
    }
}

class RaceHorse extends Horse{
    private int numberOfRaces;

    public void setNumberOfRaces(int numberOfRaces) {
        this.numberOfRaces = numberOfRaces;
    }

    public int getNumberOfRaces() {
        return numberOfRaces;
    }
}
public class HorseDemo {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        RaceHorse horse2 = new RaceHorse();
        horse1.setName("Jasper");
        horse1.setColor("Brown");
        horse1.setBirthYear(2009);
        horse2.setName("Apollo");
        horse2.setColor("Black");
        horse2.setBirthYear(2011);
        horse2.setNumberOfRaces(4);
        System.out.println(horse1.getName() + " is " + horse1.getColor() + " and was born in " + horse1.getBirthYear() + ".");
        System.out.println(horse2.getName() + " is " + horse2.getColor() + " and was born in " + horse2.getBirthYear() + ".");
        System.out.println(horse2.getName() + " has been in " + horse2.getNumberOfRaces() + " races.");
    }
}
