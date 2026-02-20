/**
* OOPSBannerApp _Use Map for Character Pattern and Render via Function
* 
* This use case extends UC7 by utilizing advanced Object_Oriented Programming concepts
* such as the Collections Framework to manage character patterns in a more flexible
* and efficient manner. The application retrieves and displays the "OOPS" banner
* using a HashMap there by enhancing code organization and modularity.
* 
* @author Developer
* @version 8.0
*/

import java.util.HashMap;

public class PrintOOPS{
	public static HashMap <Character, String[]> createCharacterMap(){
		HashMap <Character, String[]> charMap = new HashMap<>();
		charMap.put('O', new String[] {"   ***   "," **   ** ","**     **","**     **","**     **","**     **","**     **"," **   ** ","   ***   "});
		charMap.put('P', new String[] {"******   ","**    ** ","**     **","**    ** ","******   ","**       ","**       ","**       ","**       "});
		charMap.put('S', new String[] {"   ***** "," **      ","**       "," **      ","   ***   ","      ** ","       **","      ** "," *****   "});
		
		return charMap;
	}
	
	public static void displayBanner(String message, HashMap <Character, String[]> charMap){
		int patternHeight = charMap.get('O').length;
		for(int line = 0; line<patternHeight; line++){
			for(int j=0;j<message.length();j++){
				String[] s=charMap.get(message.charAt(j));
				System.out.print(s[line]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		HashMap <Character, String[]> charMap = createCharacterMap();
		String message = "OOPS";
		displayBanner(message, charMap);
	}
}