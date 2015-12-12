package a;

import java.util.Scanner;


/**
 * Hello world!
 *
 */
public class App 
{
	String op ="";
	public String getOp() {
		return op;
	}

	public void setOp(String op) {
		this.op = op;
	}
	int res = 0;
	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public int add(int a , int b){
			return a + b ;
}

	public int sub(int a , int b){
			return a - b ;
}
	public int mul(int a , int b){
		return a * b ;
}
	public int div(int a , int b){
		return a / b ;
}
	public static void main(String[] args) {
		int a = 0;
		int b =0;
		String rep = "";
		boolean print = true;
		boolean repeat = true;
		while(repeat)
		{
		
		App tr = new App();
		Scanner scan = new Scanner(System.in);
		System.out.println("Erste Zahl bitte.");
		a =scan.nextInt();
		System.out.println("Zweite Zahl bitte.");
		b =scan.nextInt();
		System.out.println("Wähle eine Operation aus.");
		tr.setOp( scan.next());
		if(tr.getOp().equals("+"))
		{
			tr.setRes( tr.add(a,b));
		}
		else if(tr.getOp().equals("-"))
		{
			tr.setRes(tr.sub(a, b));
		}
		else if(tr.getOp().equals("*"))
		{
			tr.setRes(tr.mul(a, b));
		}
		else if(tr.getOp().equals("/"))
		{
			tr.setRes(tr.div(a, b));
		}
		else
		{
		System.out.println("Falsche Eingabe");
		print = false;

		}
		if(print)
		System.out.println("Res= "+ tr.getRes());
		System.out.println("Ausgang? Y or n");
		rep = scan.next();
		if(rep.equals("n"))
			repeat = true;
		else repeat = false;


	}
	}
}
