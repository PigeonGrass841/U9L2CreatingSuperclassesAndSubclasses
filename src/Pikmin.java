public class Pikmin extends VideoGame {
    private boolean newPlayControl;

    public Pikmin(String title, boolean coOp, boolean newPlayControl)
    {
        super(title, coOp);
        this.newPlayControl = newPlayControl;
    }

    public void fweet()
    {
        System.out.println("Fweeet!");
    }

    public boolean isNewPlayControl()
    {
        return this.newPlayControl;
    }
}