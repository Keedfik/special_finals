import java.text.SimpleDateFormat;

public class PackAnimal extends Animal{

    private int liftWeight;

    public int getLiftWeight() {
        return liftWeight;
    }

    public void setLiftWeight(int liftWeight) {
        this.liftWeight = liftWeight;
    }

    public PackAnimal(String Name, SimpleDateFormat date_of_birth, String command ,int liftWeight) {
            super(Name, date_of_birth, command);
            this.liftWeight = liftWeight;
        }

}
