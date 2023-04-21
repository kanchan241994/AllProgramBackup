package string;

public class StringMethod1 {
	
	public static void main(String[]args) {
		 String a="Knachan";
		 System.out.println(a);
		 char[]var=a.toCharArray();
		 for(int i=0;i<var.length;i++) {
			 System.out.println("tochararray= "+var[i]);//tochararray
	}
		 
		String b="kan3ch5n";
		char ch=b.charAt(3);
		boolean var2=Character.isDigit(ch);
		System.out.println("Character.isDigit= "+var2); //character.isDigit
		
		String c="Software Testing";
		String[] output=c.split("\\s");
		for(String outer:output)
			System.out.println("Split= "+outer);//Split
		
		String d="  ";
		boolean var3=d.isBlank();
		System.out.println("isblank= "+var3);//isBlank
		
		boolean var4=d.isEmpty();
		System.out.println("isempty= "+var4);//isEmpty
		
		 
		 

}
}