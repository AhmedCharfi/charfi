package Rechner;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * simple Implementation of Calculator Example
 * @author acharfi
 *
 */
public class Rechner {
	
	String rep = "";
	String op = "";
	int a = 0;
	int b = 0;
	int res = 0;
	
/**
 * 
 * @param a
 * @param b
 * @return
 */
	public int add(int a, int b) {
		return a + b;
	}
/**
 * 
 * @param a
 * @param b
 * @return
 */
	public int sub(int a, int b) {
		return a - b;
	}
	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int mul(int a, int b) {
		return a * b;
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int div(int a, int b) {
		int result = 0;
		try {
			result = a / b;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by 0!");
		}
		return result;
	}
/**
 * read the parameters that the user gives 
 * @param a
 * @param b
 * @param op
 */
	public void readparam(int a, int b, String op) {
		boolean repeat= true;
		boolean ok = true;
		Scanner scan = new Scanner(System.in);
		while(repeat)
		{
		try
		{
		System.out.println("First Number");
		
		this.a = scan.nextInt();
		repeat = false;
		ok = true;
		}
		catch(InputMismatchException e)
		{
			System.out.println("wrong format");
			repeat = true;
			ok = false;
			break;
		}
		try
		{
		// a =scan.nextInt();
		System.out.println("Second Number");
		this.b = scan.nextInt();
		repeat = false;
		ok = true;

		
		}
		catch(InputMismatchException e)
		{
			System.out.println("wrong format");
			repeat = true;
			ok = false;
			break;

		}
		// b =scan.nextInt();
		if(ok)
		{
		try
		{
		System.out.println("choose an Operation : +  * / - ");
		// op =scan.next();
		this.op = scan.next();
		repeat = false;

		}
		
		catch(InputMismatchException e)
		{
			System.out.println("wrong format");
			repeat = true;
		}
		}
		}
	}
/**
 * main 
 * @param args
 */
	public static void main(String[] args) {
		boolean print = true;
		boolean repeat = true;
		Rechner tr = new Rechner();
		Scanner scan = new Scanner(System.in);

		while (repeat) {
			print = tr.getOperator(print, tr);
			if (print)
				System.out.println("Res= " + tr.getRes());
			System.out.println("Quit? Y or n");
			tr.setRep(scan.next());
			if (tr.getRep().equals("n"))
				repeat = true;
			else
				repeat = false;

		}
		//scan.close();
	}
/**
 * get the operator
 * @param print
 * @param tr
 * @return
 */
	public boolean getOperator(boolean print, Rechner tr) {
		Scanner scan = new Scanner(System.in);
		boolean repeat = true;

		if (print)
			tr.readparam(tr.getA(), tr.getB(), tr.getOp());
		if (tr.getB() == 0 && tr.getOp() == "/") {
			System.out.println("Cannot divide by 0!");
			repeat = false;
		}
		while (repeat)
			if (tr.getOp().equals("+")) {
				tr.setRes(tr.add(tr.getA(), tr.getB()));
				repeat = false;
			} else if (tr.getOp().equals("-")) {
				tr.setRes(tr.sub(tr.getA(), tr.getB()));
				repeat = false;
			} else if (tr.getOp().equals("*")) {
				tr.setRes(tr.mul(tr.getA(), tr.getB()));
				repeat = false;
			} else if (tr.getOp().equals("/")) {
				tr.setRes(tr.div(tr.getA(), tr.getB()));
				repeat = false;
			} else {
				if(tr.getA()==0 && tr.getB()==0)
				{
					repeat = false;
					print = false;
				}
				else{
				System.out.println("wrong operator");
				System.out.println("choose an Operator : +  * / - ");
				tr.setOp(scan.next());
				print = false;
				repeat = true;
				}
			}
		print = true;
		return print;
	}
	/*
	 *setters and getters methods
	 */

	public String getRep() {
		return rep;
	}
	public void setRep(String rep) {
		this.rep = rep;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getOp() {
		return op;
	}
	public void setOp(String op) {
		this.op = op;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	/*
	 * End setters and getters methods
	 */
}
