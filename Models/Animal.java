import java.text.SimpleDateFormat;

public abstract class Animal {
    String pattern = "yyyy-MM-dd";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    private String name;
    private SimpleDateFormat date_of_birth;
    private String command;

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Animal(String name, SimpleDateFormat date_of_birth, String command) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.command = command;
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
        return "Animal [name=" + name + ", date of birth=" + date_of_birth + ", command="+ command+ "]";
    }

}