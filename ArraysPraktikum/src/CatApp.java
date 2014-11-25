import java.util.Arrays;


public class CatApp 
{

	public static void main(String[] args) 
	{
		
		//StrUtils su = new StrUtils();
		
		Cat cat1 = new Cat();
		cat1.name = "Charles";
		cat1.alter = 2;
		cat1.rasse = "Perser";
		cat1.farbe = "schwarz";
		
		Cat cat2 = new Cat();
		cat2.name = "Lily";
		cat2.alter = 3;
		cat2.rasse = "Perser";
		cat2.farbe = "weiß";
		
		Cat[] array = {cat1, cat2};
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i].name);
		}
		
		Plant p1 = new Plant("Acaena", "Stachelnüsschen");
		Plant p2 = new Plant("Abies", "Tannen");
		Plant p3 = new Plant("Acer", "Ahorn");
		Plant p4 = new Plant("Armeria", "Grasnelke");
		Plant p5 = new Plant("Arum", "Aronstab");
		
		
		Plant[] plants = {p1, p2, p3, p4, p5};
		
		Integer counter = 0;
		String s;
		for(int i=0; i<plants.length; i++)
		{
			s = plants[i].germanName;
			if (Character.isLetter(s.charAt(i)))
			{
				counter++;
			}
		}
			
		int i = 0;
		while(i < plants.length)
		{	
			s = plants[i].botanicalName;
			System.out.println(s);
			i++;
		}
		
		System.out.println("+++++");
		plants = Arrays.copyOfRange(plants, 1, plants.length);
		

		for(i = 0; i < plants.length; i++)
		{
			System.out.println(plants[i].botanicalName);
		}
		
//		s = plants[i].botanicalName;
//		System.out.println(s);	
//		counter = su.countChars(s);
//		System.out.println(counter);

	}
}

