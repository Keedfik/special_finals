package Model;

import Interfaces.iModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class AddAnimal implements iModel {

    private final ArrayList<Animal> animalRegister;

    public AddAnimal() {
        this.animalRegister = new ArrayList<>();
    }

    public void getNewAnimal(String name, SimpleDateFormat date_of_birth, String command, String type) {

        Counter count = new Counter();
        HashMap<String, Animal> check = new HashMap<>();
        check.put("Cat", new Cat(name, date_of_birth, command, type));
        check.put("Dog", new Dog(name, date_of_birth, command, type));
        check.put("Hamster", new Hamster(name, date_of_birth, command, type));
        check.put("Horse", new Horse(name, date_of_birth, command, type));
        check.put("Camel", new Camel(name, date_of_birth, command, type));
        check.put("Donkey", new Donkey(name, date_of_birth, command, type));

        Animal animal = check.get(type);
        animalRegister.add(animal);
        assert animal != null;
        count.add_count();

    }

    public ArrayList<Animal> load_animal() {

        return animalRegister;
    }

    @Override
    public void getCommand(String name) {
        for (Animal animal : this.animalRegister) {
            if (Objects.equals(name, animal.getName())) {
                System.out.println(animal.getCommand());
            }
        }
    }

    @Override
    public void learnCommand(String name, String command) {
        for (Animal animal : this.animalRegister) {
            if (Objects.equals(name, animal.getName())) {
                animal.addCommand(command);
                System.out.println("Skill Learn");
            }
        }
    }

    @Override
    public ArrayList<Animal> animalList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'animalList'");
    }

}