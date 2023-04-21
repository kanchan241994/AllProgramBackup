package string;

public class StringMethods {
	public static void main(String[]args) {
		String a="Software";
		String b="testing";
		char c=a.charAt(4);  //charAt
		System.out.println("charat= " +c);
		
		String d=a.concat(b);   //concat
		System.out.println("Concat= "+d);
		
		String e="Automation";//equalsz
		String g="AUTOMATION";
		String f=new String("Automation");
		
		System.out.println("Equals= "+(e==f));
		System.out.println(e.equals(f));
		
		boolean var=e.equalsIgnoreCase(g);  //equalignorecase
		System.out.println("equalsIgnoreCase= "+var);
		
		String var1=a.substring(6); //substring(beginindex)
		System.out.println("beginindex= "+var1);
		
		String var2=a.substring(0,4); //substring(endindex)
		System.out.println("endindex= "+var2);
		
		int var3=d.length();  //length(d=softwaretesting)
		System.out.println("length= "+var3);
	}

}
