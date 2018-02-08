package com.nauka;

import java.util.Random;
import java.util.Scanner;

public class Kamien_Papier_Nozyce_3 
{

	public static void main(String[] args) 
	{
		System.out.println("=========================================");
		System.out.println("Witaj w grze \"Kamień, papier, nożyce\".");
		System.out.println("=========================================");
		System.out.println("                                          ");
		System.out.println("Gra trwa do trzech zwycięstw.");
		int wynikRemis = 0;
		int wynikGracza = 0;
		int wynikKomputera = 0;
		
		while ((wynikGracza < 3) && (wynikKomputera < 3))
		{
			
		System.out.println("Wybierz: kamień (wybierz 1), papier (wybierz 2) lub nożyce (wybierz 3).");
		
		Scanner input = new Scanner(System.in);
		int gracz = input.nextInt();

			if (gracz == 1)
			{
				System.out.println("Kamień");
			}
			else if (gracz == 2)
			{
				System.out.println("Papier");
			}
			else if (gracz == 3)
			{
				System.out.println("Nożyce");
			}
				Random random = new Random ();
				int komputer = random.nextInt(3)+1;
				
				System.out.println("Komputer wybiera: ");
				
				if (komputer == 1)
				{
					System.out.println("Kamień");	
				}
				else if (komputer == 2)
				{
					System.out.println("Papier");
				}
				else if (komputer == 3)
				{
					System.out.println("Nożyce");
				}
				
				System.out.println("=========================================");
				
					if (gracz - komputer == 0)
					{	wynikRemis = wynikRemis +1; 
						System.out.println("Remis. Spróbuj ponownie");
						System.out.println("Stan gry: "+ "Remisy = "+ wynikRemis +" Wygrane Gracza = " + wynikGracza + " Wygrane Komputera = " + wynikKomputera);
					}
				
					else if ( gracz - komputer == -2)
					{	wynikGracza = wynikGracza +1;
						System.out.println("Wygrałeś! Gratulacje!");
						System.out.println("Stan gry: "+ "Remisy = "+ wynikRemis +" Wygrane Gracza = " + wynikGracza + " Wygrane Komputera = " + wynikKomputera);
					}
					
					else if (gracz - komputer == 1)
					{	wynikGracza = wynikGracza +1;
						System.out.println("Wygrałeś! Gratulacje!");
						System.out.println("Stan gry: "+ "Remisy = "+ wynikRemis +" Wygrane Gracza = " + wynikGracza + " Wygrane Komputera = " + wynikKomputera);
					}
					
					else 
					{	wynikKomputera = wynikKomputera +1;
						System.out.println("Niestety, przegrałeś! Może następnym razem się uda!");
						System.out.println("Stan gry: "+ "Remisy = "+ wynikRemis +" Wygrane Gracza = " + wynikGracza + " Wygrane Komputera = " + wynikKomputera);
					}
					
					System.out.println("                                      ");
					System.out.println("                                      ");
			}
		
		System.out.println("Koniec gry");
	}

}
