package Interfaces;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import Model.Animal;

public abstract interface iModel {

    void getNewAnimal(String name, SimpleDateFormat date_of_birth, String command, String type);

    ArrayList<Animal> animalList();

    void getCommand(String var1);

    void learnCommand(String var1, String var2);

}
