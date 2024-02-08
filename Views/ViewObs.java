package Views;

import java.text.SimpleDateFormat;

public interface  ViewObs {
    void onGetAnimal(String name, SimpleDateFormat date_of_birth, String command, String type);
    void loadAnimalRegister();
}
