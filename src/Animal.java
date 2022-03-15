public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean hungry;

    public Animal (String name, int age, boolean vaccinated, boolean hungry)
    {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.hungry = hungry;
    }

    public void adopt()
    {
        System.out.println("I have been adopted");
    }

    public void feed()
    {
        System.out.println("I have been fed, thank you");
    }

    public void starve()
    {
        System.out.println("I am hungry");
    }

    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public boolean isVaccinated()
    {
        return this.vaccinated;
    }

    public boolean isHungry()
    {
        return this.hungry;
    }
}
