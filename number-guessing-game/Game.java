import java.util.*;
public class Game {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r1=new Random();
		int random=r1.nextInt(101);
		int attemt=0;
		while(attemt<3){
			System.out.println("Guess the Number?");
			int guess=sc.nextInt();
			if(random==guess) {
				System.out.println("============================");
				System.out.println("Congrats! you got the Number");
				System.out.println("============================");
				break;
			}
			else if(random<guess){
				System.out.println("============================");
				System.out.println("your answer is to high");
				System.out.println("============================");
			}
			else if(random>guess){
				System.out.println("============================");
				System.out.println("your answer is to low");
				System.out.println("============================");
			}
			attemt++;
			if(attemt<3) {
				System.out.println("============================");
				System.out.println("You have "+(3-attemt)+"Attemets");
				System.out.println("============================");
			}
			else {
				System.out.println("============================");
				System.out.println("you lost the Game");
				System.out.println("============================");
			}
		}

	}

}
