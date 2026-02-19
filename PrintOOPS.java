/**
* OOPSBannerApp UC7 – Store Character Pattern in a Class
*
* This use case extends UC6 by implementing a CharacterPatternMap class to encapsulate 
* character-to-pattern mappings. The application retrieves and displays the "OOPS"
* banner using these mappings. This approach enhances code organization and modularity.
*
* @author Developer
* @version 7.0
*/

public class PrintOOPS{
	public static class CharacterPatternMap{
		public char Character;
		public String[] Pattern;
	
		public CharacterPatternMap(char Character, String[] Pattern){
			this.Character=Character;
			this.Pattern= Pattern;
		}
		public Character getCharacter(){
			return Character;
		}
		public String[] getPattern(){
			return Pattern;
		}
			
		public static CharacterPatternMap[] createCharacterPatternMaps(){
			CharacterPatternMap[] mp = new CharacterPatternMap[3];
				
			mp[0]=new CharacterPatternMap('O',new String[] {"   ***   "," **   ** ","**     **","**     **","**     **","**     **","**     **"," **   ** ","   ***   "});
			mp[1]=new CharacterPatternMap('P',new String[] {"******   ","**    ** ","**     **","**    ** ","******   ","**       ","**       ","**       ","**       "});
			mp[2]=new CharacterPatternMap('S',new String[] {"   ***** "," **      ","**       "," **      ","   ***   ","      ** ","       **","      ** "," *****   "});
				
			return mp;
		}
		
		public static String[] getCharacterPattern(char character, CharacterPatternMap[] charMaps){
			for(CharacterPatternMap m:charMaps){
				if(m.getCharacter()==character){
						return m.getPattern();
				}
			}
			return null;
		}
			
		public static void printMessage(String message, CharacterPatternMap[] charMaps){
			for(int i=0;i<9;i++){
				for(int j=0;j<message.length();j++){
					String[] s=getCharacterPattern(message.charAt(j),charMaps);
					System.out.print(s[i]+" ");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args){
		CharacterPatternMap[] charMaps = CharacterPatternMap.createCharacterPatternMaps();
		String message = "OOPS";
		CharacterPatternMap.printMessage(message, charMaps);
	}
}