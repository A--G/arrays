import java.util.Arrays;


public class CatApp 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		StrUtils su = new StrUtils();
		
		Cat cat1 = new Cat();
		cat1.name = "Charles";
		cat1.alter = 2;
		cat1.rasse = "Perser";
		cat1.farbe = "schwarz";
		
		Cat cat2 = new Cat();
		cat1.name = "Lily";
		cat1.alter = 3;
		cat1.rasse = "Perser";
		cat1.farbe = "weiß";
		
		Cat[] array = {cat1, cat2};
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(array[i].name);
		}
		
		Plant p1 = new Plant();
		p1.botanicalName = "Acaena";
		p1.germanName = "Stachelnüsschen";
		
		Plant p2 = new Plant();
		p2.botanicalName = "Abies";
		p2.germanName = "Tannen";
		
		Plant p3 = new Plant();
		p3.botanicalName = "Acer";
		p3.germanName = "Ahorn";
		
		Plant p4 = new Plant();
		p4.botanicalName = "Armeria";
		p4.germanName = "Grasnelke";
		
		Plant p5 = new Plant();
		p5.botanicalName = "Arum";
		p5.germanName = "Aronstab";
		
		Plant[] plants = {p1, p2, p3, p4, p5};
		for(int i=0; i<plants.length; i++)
		{
			if (Character.isLetter(s.charAt(i))){
				counter++;
		}
			
	
		while(i < plants.length)
		{
			String s = plants[i].botanicalName;
			System.out.println(s);
		}
		
		System.out.println("+++++");
		plants = Arrays.copyOfRange(plants, 1, plants.length);
		
		//array[0] = null;
		

		for(i=0; i<plants.length; i++)
		{
			System.out.println(plants[i]);
		}
		
		/*String s = plants[i].botanicalName;
		System.out.println(s);	
		int counter = su.countChars(s);
		System.out.println(counter);*/

	}
	}
}
