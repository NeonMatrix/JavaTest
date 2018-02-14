package ie.dit;

public class Tune
{
    int x;
    String title;
    String altTitle;
    String notation;

    // Accessors
    public int getX()
    {
        return x;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAltTitle()
    {
        return altTitle;
    }

    public String getNotation()
    {
        return notation;
    }

    public String toString()
    {
        String ret = x + ", " + title + ", " + altTitle;
        return ret;
    }

    public void setElements(int x, String title, String altTitle, String notation)
    {
        this.x = x;
        this.title = title;
        this.altTitle = altTitle;
        this.notation = notation;
    }
}
