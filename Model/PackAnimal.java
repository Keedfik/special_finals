package Model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class PackAnimal extends Animal {
    public PackAnimal(String name, SimpleDateFormat date_of_birth, String command, String type) {
        super(name, date_of_birth, command, type);
    }

    @Override
    public ArrayList<String> getCommand() {
        command.add("cargo yes");
        command.add("cargo no");
        return command;
    }

    public void yesCargo() {
        System.out.println("cargo yes");
    }

    public void noCargo() {
        System.out.println("cargo no");
    }

}
