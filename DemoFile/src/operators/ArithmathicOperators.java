package operators;

public class ArithmathicOperators {
    
	public static void main(String[]args) {
		int a=40;
		int b=20;
		int c;
		c=a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);
		c=a*b;
		System.out.println(c);
		c=a/b;
		System.out.println(c);
		c=((a++)-(++a));
		System.out.println(c);
		c=((b--)+(--b));
		System.out.println(c);
		
	if(a>b){
		System.out.println("a is greater than b");
		}
	else {
		System.out.println("b is greater than a");
	
	}
	if(a<b){
		System.out.println("a is greater than b");
		}
	else {
		System.out.println("b is greater than a");
	
	}
	if((a==b)&&(!(a==b))) {
		System.out.println("true");
	}
	else if((a==35)&&((a==20))) {
		System.out.println("equals");
	}
	else{
		System.out.println("false");
	}
	if((a>b)||(b<a)) {
		System.out.println("true");
	}
	else if(!(a==45)||(!(a==60))) {
		System.out.println("equals");
		}
	else if(a<b) {
		System.out.println("false");
	}
	
	
	}
}
