
public class sameLetter {

	public static void main(String[] args) {
/*This code prints out three letters with one common paragraph, greeting, and goodbye to them.
 * One letter to my parent, one letter to my friend, and one letter to my sibling. 3 methods were called in my main method.
 */
//Mom Letter
		Mom();
//Friend Letter
		Friend();
//Sibling Letter
		Sibling();
	}
	
	public static void feeling() {
//Generic Salutations. The start of the letter before the paragraphs.
		System.out.println("How are you? I miss you so much.\n");
	}
	
	public static void goodbye() {
//The ending of every letter
		System.out.println("\nSincerely,");
		System.out.println("     Sabrina K.\n");
	}
	
	public static void money() {
//Common paragraph included in all 3 of my letters.
		System.out.println("  I need money badly. I need about 100,000 dollars because I lost most of");
		System.out.println("gambling on Pokemon battles. Now the Pokemon gang is after me because I haven't");
		System.out.println("fully paid my debt to them. I think they are going to kidnap me and force me to");
		System.out.println("give up all my best pokemon cards. So if you want me to live please send money for my cause.");
	}
	
	public static void friends() {
//Just in letter to my mom
		System.out.println("  I have no friends in college. Though I do not have human friends, my clothes are my friends.");
		System.out.println("My clothes have been very kind to me and nice. My best friends so far is my beanie. We have an");
		System.out.println("ongoing game of tic-tack-toe right now. The game is getting intense. I really love my friends.");
		System.out.println("Also making friends is so much easier beacuse I can just buy them.");
	}
	
	public static void loveLife() {
//Just in letter to my sibling
		System.out.println("  My love life is really active right now. I am on Chrisitian mingle, Jewish mingle,");
		System.out.println("Indian mingle, and Tinder. However there are some creepy people on Tinder so I usually");
		System.out.println("use Indian mingle to find my love interests. I also think my friend, Jacket, has a crush on me");
		System.out.println("Please help me figure out my love life. Should I give Jacket a chance?");
	}
	
	public static void school() {
//Just in letter to my friend
		System.out.println("  My classes in college are fine. It's really easy to have no stress when you don't do homework");
		System.out.println("However there is one class that I absolutely love. The class is called Pokemon Fight Night. The");
		System.out.println("teacher of the class is a wise old man who has taught me a lot about Pokemon and Pokemon go. All");
		System.out.println("the other class suck so far though.");
	}
	
	public static void Mom() {
		System.out.println("Dear Mom, \n");
		feeling();
		friends();
		money();
		goodbye();
	}
	
	public static void Friend() {
		System.out.println("Dear my amigo, \n");
		feeling();
		money();
		school();
		goodbye();
	}
	
	public static void Sibling() {
		System.out.println("Dear my sibling, \n");
		feeling();
		money();
		loveLife();
		goodbye();
	}
}
	
