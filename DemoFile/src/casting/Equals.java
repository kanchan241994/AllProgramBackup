package casting;

public class Equals {
	
	public static void main(String[]args) {
	String a="kanchan";
	String b="kanchan";
	String c=new String("kanchan");
	
	System.out.println(a==c);
	System.out.println(a.equals(c));
	
	System.out.println(a==b);
	System.out.println(a.equals(b));
	

}
}