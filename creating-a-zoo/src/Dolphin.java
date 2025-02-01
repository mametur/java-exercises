public class Dolphin extends Animal implements Swim{
    private String colorOfDolphin;
    private int speedOfSwimming;

    public Dolphin (){
        super("Dolphin");
    }
    public Dolphin (String nameofAnimal){
        super(nameofAnimal);
    }

    // GETTERS
    public String getColor() {
        return colorOfDolphin;
    }
    public int getSwimmingSpeed() {
        return speedOfSwimming;
    }

    // SETTERS
    public void setColor(String colorOfDolphin) {
        this.colorOfDolphin = colorOfDolphin;
    }
    public void setSpeed(int speedOfSwimming) {
        this.speedOfSwimming = speedOfSwimming;
    }

    @Override
    public void eatingCompleted() {
        System.out.println("Dolphin: I have eaten fish");
    }
    public void eatingFood() {
        System.out.println("Dolphin: I am eating delicious fish");
    }

    // METHODS FROM INTERFACE SWIM
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of: " + speedOfSwimming + " nautical miles per hour");
    }

}
