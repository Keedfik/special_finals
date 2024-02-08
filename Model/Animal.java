package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class Animal {
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    private final int id;
    private static int counter = 0;
    private String name;
    private SimpleDateFormat date_of_birth;
    protected final ArrayList<String> command;
    public String type;

    public Animal(String name, SimpleDateFormat date_of_birth, String command, String type) {
        this.id = ++counter;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.command = new ArrayList<>(Arrays.asList("Walk", "Eat", "Lay"));
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SimpleDateFormat getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(SimpleDateFormat date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "Animal [id= " + id + "name=" + name + ", date of birth=" + date_of_birth + ", commands=" + command
                + "]";
    }

    public ArrayList<String> getCommand() {
        return command;
    }

    public void addCommand(String newCommand) {
        command.add(newCommand);
    }

}