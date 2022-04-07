package simpleGameNumber;
import java.util.Scanner;
public class Tucheze {

	public static void main(String[] args) {
		randomPick pick1=new randomPick();
		int  Hresult = 0;
		int Cresult = 0;		
		System.out.println("Beat me out of 3 to win Pick number btn 1-10");
		System.out.println("Pick the number if your number is greater than mine");
		System.out.println("You win,If my number is greater than yours You lose");
		Scanner ingizo=new Scanner(System.in);
		System.out.println("Enter Your Number");
		int counter=0;
		while(counter<3) 
		{
			pick1.getnumber(10);
			int a1=ingizo.nextInt();
			if(a1<=10 && a1>pick1.showNumber())
			{
				
				Hresult+=1;
				System.out.println("\nYou won this round");
				System.out.println("Computer number:"+pick1.showNumber());
				System.out.println("Your Number :"+a1);
			}
			else if(a1<=10 && a1<pick1.showNumber())
			{
				
				Cresult+=1;
				System.out.println("\nYou lost this round");
				System.out.println("Your Number "+a1);
				System.out.println("Computer number:"+pick1.showNumber());				
			}
			else if(a1<=10 && a1==pick1.showNumber())
			{
				System.out.println("\nThis round is a draw,\nHahaha Gotchu");
				System.out.println("Your Number :"+a1);
				System.out.println("Computer number:"+pick1.showNumber());
			}
			else
			{
				System.out.println("\nIts just a simple game follow instruction");
				System.out.println("Your Number :"+a1);
				counter--;
			}	
			counter++;
		}
		ingizo.close();
			if(Hresult>Cresult)
			{
				System.out.print("\n\nYou have Won the Game");
			}
			else if(Hresult<Cresult)
			{
				System.out.print("\n\nYou have lose the Game");
			}
			else if(Hresult==Cresult)
			{
				System.out.print("\n\nIts a Draw");
			}
			else
			{
				System.out.println("\n\nPlease follow the instructions");
			}
		}
}