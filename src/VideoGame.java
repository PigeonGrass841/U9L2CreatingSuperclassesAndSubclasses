public class VideoGame {
    private String title;
    private boolean coOp;

    public VideoGame(String title, boolean coOp)
    {
        this.title = title;
        this.coOp = coOp;
    }

    public void play()
    {
        System.out.println("The video game was inserted into the console");
    }

    public String getTitle()
    {
        return this.title;
    }

    public boolean isCoOp()
    {
        return this.coOp;
    }
}
