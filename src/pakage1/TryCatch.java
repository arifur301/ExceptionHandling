package pakage1;

public class TryCatch {

	public static void main(String[] args) {
		
//   ArrayIndexOutOfBoundsException		
		
	int[] myNumbers = {11, 25, 36};
	String myName = null;
	String myName1 = "John";
	
		
	try {
		System.out.println(myNumbers[1]);
		System.out.println(myName.charAt(1));
		System.out.println(myName1.charAt(1));
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Bad index");
	}catch(NullPointerException e) {
		System.out.println("Null Pointer - No Data");	
	}catch(StringIndexOutOfBoundsException e) {
		System.out.println("No Data");
	}
	
	}
}
