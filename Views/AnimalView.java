package Views;

import java.text.SimpleDateFormat;
import java.util.Collection;

import Model.Animal;

public class AnimalView implements View {
    private ViewObs observer;

    public AnimalView(){
    }

    public void showAnimals(Collection<Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public void setObserver(ViewObs observer) {
        this.observer = observer;
    }

    public void getanimla(String name, SimpleDateFormat date_of_birth, String command, String type) {
        this.observer.onGetAnimal(name, date_of_birth, command, type);
    }

    public void loadAnimals() {
        this.observer.loadAnimalRegister();
    }
}
