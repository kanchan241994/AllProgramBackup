package exception;

public class Test3 {
	
	public void totalmarks(int marks) {
		if(marks<=40) {
			throw new IllegalArgumentException("failed");
		}
		else
		{
			System.out.println("Passed");
		}
	}
		public static void main(String[]args) {
			Test3 ref=new Test3();
			try {
				ref.totalmarks(39);
				}
			catch(IllegalArgumentException ref1) {
				System.out.println(ref1.getMessage());
			}
			ref.totalmarks(50);
			
		}
	}


