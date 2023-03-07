package NaveenInterviewQuestionYouTube;

public class RemoveJunk {

	public static void main(String[] args) {
		
	String str= "%$&*()&% JavaTest (**()selenium(*(***&";
	// Expected result: JavaTest
	
	// we can achieve it by reg expression
	// reg exp= [^a-zA-z0-9]
     
	String s= str.replaceAll("[^ a-zA-z0-9]", "");
	
	System.out.println(s);
	System.out.println(s.trim());
	
	String str1=str.replace("(", "a");
	System.out.println(str1);
	}

}
