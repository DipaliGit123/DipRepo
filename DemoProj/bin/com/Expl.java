
import java.lang.*;
import java.util.Scanner;
public class Expl{
	private int num ,denom;

	public Rational(Double d){
		String s=String.valueOf(d);
		int digitsDec=s.length()-1-s.indexOf('.');
		for(int i=0;i<digitsDec;i++){
		d*=10;
		denom*=10;
	
		}
		int num=(int)Math.round(d);
		this.num=num;
		this.denom=denom;
	
	}
	public Rational(int num,int denom){
		this.num=num;
		this.denom=denom;
	
	}
	public String toString(){
		return String.valueOf(num)+"/"+ String.valueOf(denom);
	}
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num::");
		float num=sc.nextFloat();
		int m=(int)num;
		System.out.println("Enter num in words::"+new Rational(1.5));








	}
}