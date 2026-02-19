/**
* OOPSBannerApp UC6 – OOPS Banner Application (Use Case 6)
*
* This use case extends UC5 by implementing a modular approach to generate each
* letter's pattern through dedicated methods. This enhances code reusability and
* maintainability by seperating pattern generation logic from the main display logic.
* 
* @author Developer
* @version 6
*/

class PrintOOPS{
	public static String[] getOPattern(){
		String olines[] = {
			"   ***   ",
			" **   ** ",
			"**     **",
			"**     **",
			"**     **",
			"**     **",
			"**     **",
			" **   ** ",
			"   ***   "
		};
		return olines;
	}
	public static String[] getPPattern(){
		String plines[] = {
			"******   ",
			"**    ** ",
			"**     **",
			"**    ** ",
			"******   ",
			"**       ",
			"**       ",
			"**       ",
			"**       "
		};
		return plines;
	}
	public static String[] getSPattern(){
		String slines[] = {
			"   ***** ",
			" **      ",
			"**       ",
			" **      ",
			"   ***   ",
			"      ** ",
			"       **",
			"      ** ",
			" *****   "
		};
		return slines;
	}
	
	public static void main(String[] args){
			
		String[] oPattern = PrintOOPS.getOPattern();
		String[] pPattern = PrintOOPS.getPPattern();
		String[] sPattern = PrintOOPS.getSPattern();
		
		for(int i =0; i<oPattern.length; i++){
			System.out.println(oPattern[i]+oPattern[i]+pPattern[i]+sPattern[i] );	
		}
	}
}