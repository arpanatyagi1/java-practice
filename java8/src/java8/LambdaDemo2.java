package java8;
//block lambda expression
public class LambdaDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      MyString reverseStr=(str)->
      {
    	  String result=" ";
    	  
    	  for(int i=str.length()-1;i>=0;i--)
    		  result+=str.charAt(i);
    	  return result;
      };
      System.out.println(reverseStr.myStringFunction("Lambda Demo"));
	}

}
