
public class StrUtils 
{
	int countChars(String s)
	{
		int counter = 0;
		s.toLowerCase();
		
		for (int i = 0; i < s.length(); i++)
		{
				counter++;
		}
		
		return counter;	
	}
}
