/**
 * @Author BenXUser
 * @Author Swee4T
 * @File JavaWall.java
 * @Copyright BenXUser & Swee4T
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

	/* ======= HAIKU =======
		Are they listen? She acts
		disdained - "...o gajo está..."
		They listened while muted.
	*/
	public int retrieveArrayIndex(T[] array, T search){
		for (int index = 0; index < array.length; index++) {
			if (array[index].equals(search)) {
				return index;
			}
		}
		return -1;
	}

	/* ======= HAIKU =======
		High temperatures
		are not a warning enough
		for humans to stop
	*/
	public void breakLines(int n) {
		if (n > 0) {
			System.out.println();
			breakLines( n - 1);
		}
	}

	/* ======= HAIKU =======
		The system will be
		fucked not by one mind but
		by a collective
	*/
	public boolean isSingleDigit(int digit) {
		if (x > -10 && x < 10) {
			return true;
		} else {
			return false;
		}
	}

	/* ===== HAIKU =====
		Tough as spectator
		Where darkness lies around, is
		a shadow unseen
	*/
	public void countdown(int number) {
		if (number == 0) {
			System.out.println("GO!");
		} else {
			System.out.println(number);
			Thread.sleep(999);
			coundown (number - 1);
		}
	}

	/* ===== HAIKU =====
		Avoiding the news.
		Is it ignoring or is
		it protecting off?
	*/
	public void printCollection(Collection c) {
		Iterator i = c.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
