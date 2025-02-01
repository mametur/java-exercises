public class Penguin extends Animal implements Walk, Swim {
    boolean isSwimming;
    int walkSpeed;
    int swimSpeed;
    public Penguin() {
        super("Penguin");
    }
    public Penguin(String name) {
        super(name);
    }

    //GETTERS
    public boolean isSwimming() {
        return isSwimming;
    }
    public int getWalkSpeed() {
        return walkSpeed;
    }
    public int getSwimSpeed() {
        return swimSpeed;
    }

    //SETTERS
    public void setSwimming(boolean swimming) {
        isSwimming = swimming;
    }
    public void setWalkSpeed(int walkSpeed) {
        this.walkSpeed = walkSpeed;
    }
    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }
    // INTERFACE
    @Override
    public void eatingCompleted() {
        System.out.println("Penguin: I have eaten fish");
    }
    public void eatingFood() {
        System.out.println("Penguin: I am eating delicious fish");
    }

    // METHODS FROM INTERFACE WALK
    @Override
    public void walking() {
        System.out.println("Tiger: I am walking at the speed of: " + walkSpeed + " mph");
    }

    // METHODS FROM INTERFACE SWIM
    @Override
    public void swimming() {
        System.out.println("Dolphin: I am swimming at the speed of: " + swimSpeed + " nautical miles per hour");
    }
}
