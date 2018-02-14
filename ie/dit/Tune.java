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

    /*
    public String toString()
    {
        String ret = "";
        for(int row = 0 ; row < rows ; row ++)
        {
            for(int col = 0 ; col < cols ; col ++)
            {
                ret += elements[row][col] + "\t";
            }
            ret += "\n";
        }
        return ret;
    }
    */
}
