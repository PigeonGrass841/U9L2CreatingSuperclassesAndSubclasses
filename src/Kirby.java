public class Kirby extends VideoGame {
    private boolean spinOff;

    public Kirby(String title, boolean coOp, boolean spinOff)
    {
        super(title, coOp);
        this.spinOff = spinOff;
    }

    public void poyo()
    {
        System.out.println("(> ,,O  v O,)> ~ Poyo!");
    }

    public boolean isSpinOff()
    {
        return this.spinOff;
    }
}
