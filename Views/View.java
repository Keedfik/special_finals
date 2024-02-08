package Views;

import java.util.Collection;
import Model.Animal;

public interface View {
        void showAnimals(Collection<Animal> var1);
        void setObserver(ViewObs var1);
    
    }
