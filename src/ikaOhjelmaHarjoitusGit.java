
public class ikaOhjelmaHarjoitusGit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ika = 80;
		
		if (ika >= 0 && ika < 18)
		{
			System.out.println("Olet alaikäinen");
		}
		
			if (ika >= 15)
			{
				System.out.println("Saat ajaa mopoa");
			}
			
			if (ika >= 16 && ika <= 17)
				
			{
				System.out.println("Saat ajaa kevaria");
			}
			
			
		else if (ika>= 65)
			
		{
			System.out.println("Olet eläkeläinen");
		}
			if (ika == 70 || ika == 80 || ika == 90)
				
			{
				System.out.println("Onnea tasavuosista!");
			}
		
		else
		{
			System.out.println("Olet aikuinen");
		}
			
			if (ika == 18)
				
			{
				System.out.println("Olet tullut täysi-ikäiseksi ja saat ajaa autoa");
			}
			
			if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika == 60)
			
			{
				System.out.println("Onnea tasavuosista!");
			}
	}

}
