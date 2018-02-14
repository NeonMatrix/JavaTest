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
		    //Tune newTune = new Tune;
		    while ((l = inputStream.readLine()) != null) 
		    {
		        //System.out.println(l);
		        if(l.indexOf('X') == 1);
		        {
		        	System.out.println(l);
		        }
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