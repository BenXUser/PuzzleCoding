/**
 * @Author Swee4T
 * @Author Ruben-X-Nunes
 * @File JavaWall.java
 * @Copyright Ruben-X-Nunes & Swee4T
 * @Brief TBA
 * @Date 07/09/2024
 */

public class JavaWall {

	/* ======= HAIKU =======
   	  	Entered in Java
   	  	I sent an invitation
   	  	Let's code a neat wall!
	*/
	public boolean confirmExit() {
		System.out.println("Are you sure? (YES or NO)");
		String option = input.nextLine().toLowerCase();

		if (options.equals("yes")) {
			System.out.println("Exiting...");
			return true;
		} else if (choice.equals("no")) {
			System.out.println("Returning to menu");
			return false;
		}

		System.out.prinln("Invalid option.");
		System.out.println("Returning to menu.");
		return false;
	}
}