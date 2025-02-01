public class Tiger extends Animal implements Walk{
    private  int numberOfStripes;
    private  int speed;
    private  int soundLevel;

    public Tiger (){
        super("Tiger");
    }
    public Tiger (String nameofAnimal){
        super(nameofAnimal);
    }

    // GETTERS
    public int getNumberOfStripes() {
        return numberOfStripes;
    }
    public int getSpeed() {
        return speed;
    }
    public int getSoundLevel() {
        return soundLevel;
    }

    // SETTERS
    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }
    public void setSpeed(int speedOfRunning) {
        this.speed = speedOfRunning;
    }
    public void setSoundLevel(int soundLevel) {
        this.soundLevel = soundLevel;
    }

    // METHODS FROM INTERFACE EAT
    @Override
    public void eatingCompleted() {
        System.out.println("Tiger: I have eaten meat");
    }

    // METHODS FROM INTERFACE WALK
    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed of: " + speed + " mph");
    }
}
