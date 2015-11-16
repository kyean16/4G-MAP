package application;
import java.util.Random;

public class PasswordGenerator {

	private static final String lowerCase = "abcdefghijklmnopqrstuvwxyz";
	private static final String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private static final String symbol = "!@#$%^&*";
	private static final String integers = "0123456789";
	private static Random r = new Random();
	private static String pass = new String();
	private static String finalPassword = new String();

	public String generate() {
		
		System.out.println("Im in here");
		int spot = 0;
		int u = 0; 
		int l = 0; 
		int s = 0;
		int i = 0;

    	spot = r.nextInt(25);
        pass += lowerCase.charAt(spot);
        l++;
        
    	spot = r.nextInt (25);
        pass += upperCase.charAt(spot);
        u++;
        
    	spot = r.nextInt (7);
        pass += symbol.charAt(spot);
        s++;
        
    	spot = r.nextInt (9);
        pass += integers.charAt (spot);
		i++;
        
		while (pass.length () < 16){
			System.out.println("Im in the while loop");
			int rPick = r.nextInt(4);
			if (rPick == 0){
				spot = r.nextInt(25);
				pass += lowerCase.charAt(spot);
				l++;
			} 
			else if (rPick == 1) {
				spot = r.nextInt (25);
				pass += upperCase.charAt(spot);
				u++;
			} 
			else if (rPick == 2) {
				spot = r.nextInt (7);
				pass += symbol.charAt(spot);
				s++;
				}
			else if (rPick == 3){
				spot = r.nextInt (9);
				pass += integers.charAt (spot);
				i++;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(pass);
	
	while(sb.length() > 0)
	{
		int length = sb.length();
		int letter = r.nextInt(length);
		finalPassword += sb.charAt(letter);
		sb.deleteCharAt(letter);
	}
	
	return finalPassword;
	}
}