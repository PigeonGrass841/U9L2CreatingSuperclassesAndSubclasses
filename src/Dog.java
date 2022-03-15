public class Dog extends Animal {
    private boolean walked;
    private boolean sitting;

    public Dog (String name, int age, boolean vaccinated, boolean hungry, boolean walked, boolean sitting)
    {
        super(name, age, hungry, vaccinated);
        this.walked = walked;
        this.sitting = sitting;
    }

    public void walk()
    {
        System.out.println("Time for a walk outside");
    }

    public void sit()
    {
        System.out.println("Sit. . . sit");
    }

    public boolean hasBeenWalked()
    {
        return this.walked;
    }

    public boolean isSitting()
    {
        return sitting;
    }
}