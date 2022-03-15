public class Cat extends Animal {
    private boolean played;
    private boolean itchy;

    public Cat (String name, int age, boolean vaccinated, boolean hungry, boolean played, boolean itchy)
    {
        super(name, age, hungry, vaccinated);
        this.played = played;
        this.itchy = itchy;
    }

    public void play()
    {
        System.out.println("Time to play");
        played = true;
    }

    public void scratch()
    {
        System.out.println(("I scratched it"));
    }

    public boolean hasPlayedWith()
    {
        return this.played;
    }

    public boolean isItchy()
    {
        return itchy;
    }
}