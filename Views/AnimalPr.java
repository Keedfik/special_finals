package Views;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;

import Model.Animal;
import Interfaces.iModel;

public class AnimalPr implements ViewObs {
    private final iModel animalServserse;

    private final View animalviewer;

    public AnimalPr(iModel animalServserse, View animalviewer ){
        this.animalServserse = animalServserse;
        this.animalviewer = animalviewer;
        animalviewer.setObserver(this);

    }

    public Collection<Animal> loadAnimals() {
        return this.animalServserse.animalList();
    }

    public void loadResAnimalResult(ArrayList<Animal> getAnimalResult) {
        this.animalviewer.showAnimals(getAnimalResult);
    }

    public void onGetAnimal(String name, SimpleDateFormat date_of_birth, String command, String type) {
        this.animalServserse.getNewAnimal(name, date_of_birth, command, type);

    }

    @Override
    public void loadAnimalRegister() {
        this.loadResAnimalResult(this.animalServserse.animalList());
    }

}
