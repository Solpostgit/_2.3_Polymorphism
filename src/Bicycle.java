public class Bicycle extends Transport {
       public Bicycle (String modelName, int wheelsCount) {
           super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Началось обслуживание велосипеда " + getModelName());
        super.check();
    }
}
