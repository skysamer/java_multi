package day03;

public class Prob3_이상민 
{

	public static void main(String[] args) 
	{
		String sourceString = "everyday we have is one more than we deserve";
				String encodedString = "";
				
				StringBuilder sb=new StringBuilder();
				
				
				int i;
				
				for(i=0; i<sourceString.length(); i++) 
				{
					if(sourceString.charAt(i)==' ') 
						encodedString+=' ';
					
					
					else if(sourceString.charAt(i)+3<=122) 
						encodedString+=(char)(sourceString.charAt(i)+3);
					
					
					else 
						encodedString+=(char)(sourceString.charAt(i)+3-26);
					
				}
				

				encodedString = sb.toString();
				

				// 프로그램 구현부 끝.
				
				System.out.println("암호화할 문자열 : " + sourceString);
				System.out.println("암호화된 문자열 : " + encodedString);
	}

}
