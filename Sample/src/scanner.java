import java.util.Scanner;
public class scanner {
int a,b,c;
Scanner s =new Scanner (System.in);
void input()
{
	System.out.println("enter the a and b value : \n");
	a =s.nextInt();
	b =s.nextInt();
	c =a*b;
	 System.out.println("your answer "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		scanner t=new scanner();
		t.input();

	}

}
