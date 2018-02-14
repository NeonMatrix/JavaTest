package ie.dit;
import java.util.ArrayList;
import java.io.*;

public class TuneBook
{

	ArrayList<Tune> tunes = new ArrayList<Tune>();

    public static void main(String[] args)
    {
    	String fileName = "ie/dit/hnj0.abc";
    	TuneBook tb = new TuneBook(fileName);
    	System.out.println(tb);
    }

    public TuneBook(String fileName)
    {
    	BufferedReader inputStream = null;
		try {
		    inputStream = new BufferedReader(new FileReader(fileName));
		    String l;
			String x;
			String title;
			String altTitle;
			String notation;
		    //Tune newTune = new Tune;
		    while ((l = inputStream.readLine()) != null) 
		    {
				if(l.indexOf('X') == 0)
				{
					x = l.substring(2);
					System.out.println(x);
				
				}
				if(l.indexOf('T') == 0 && l.indexOf(':') == 1)
				{
					title = l.substring(2);
					System.out.println(title);
				}

				//System.out.println(l);
		    }
		}
		catch (IOException e)
		{
		    e.printStackTrace();
		} 
		finally 
		{
		    if (inputStream != null) {
		        try
		        {
		            inputStream.close();
		        }
		        catch(Exception e)
		        {
		            e.printStackTrace();
		        }
		    }
		}    
	}
}