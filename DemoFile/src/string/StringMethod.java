package string;

public class StringMethod {
	public static void main(String[]args) {
		
		String a="abababa";
		String var=a.replace('b', 'a');
		System.out.println("replace= "+var);//replace char old with char new
		
		String b="KANCHAN";
		String var1=b.toLowerCase();
		System.out.println("toLowerCase= "+var1); //toLowerCase
		
		String c="kanchan";
		String var2=c.toUpperCase();
		System.out.println("toUpperCase= "+var2); //toUpperCase
		
		String d="  kanchan  ";
		String var3=d.trim();
		System.out.println("trim= "+var3);  //trim
		
		String e="kanchan";
		int var4=e.indexOf("c");
		System.out.println("indexof= "+var4);  //indexof
		
		String f="kanchankanchan";
		int var5=f.lastIndexOf("a");
		System.out.println("lastindexof= "+var5); //last position of repetate char//last index of
		
		String g="aadyaanandnarkhede";
		boolean var6=g.contains("anand");
		System.out.println("contains= "+var6); //contains char available or not
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
