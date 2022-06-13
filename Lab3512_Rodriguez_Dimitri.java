//Dimitri Rodriguez
//P5.12
//CS234
import java.util.Scanner;
public class Lab3512_Rodriguez_Dimitri{
	public static String getPronoun(int person, String num){
		if ("singular".equals(num)){
			if (person == 1){
				String pronoun = "I";
				return pronoun;
			}
			if (person == 2){
				String pronoun = "You";
				return pronoun;
			}
			if (person == 3){
				String pronoun = "He/She";
				return pronoun;
			}
		}
		if ("plural".equals(num)){
			if (person == 1){
				String pronoun = "We";
				return pronoun;
			}
			if (person == 2){
				String pronoun = "Y'all"; // Howdy
				return pronoun;
			}
			if (person == 3){
				String pronoun = "They";
				return pronoun;
			}
		}
		return null;
	}
	public static String conjugate(String verb, int person, String num, String tense){
		verb = verb;
		if ("past".equals(tense)){
			if (person == 1){
				if ("singular".equals(num)){
					String con = verb + "ed";
					return con;
				}
				if ("plural".equals(num)){
					String con = verb + "ed";
					return con;
				}
			}
			if (person == 2){
				if ("singular".equals(num)){
					String con = verb + "ed";
					return con; 
				}
				if ("plural".equals(num)){
					String con = verb + "ed";
					return con;
				}
			}
			if (person == 3){
				if ("singular".equals(num)){
					String con = verb + "ed";
					return con;
				}
				if ("plural".equals(num)){
					String con = verb + "ed";
					return con;
				}
			}
		}
		if ("present".equals(tense)){
			if (person == 1){
				if ("singular".equals(num)){
					String con = verb + "ing";
					return con;
				}
				if ("plural".equals(num)){
					String con = verb + "ing";
					return con;
				}
			}
			if (person == 2){
				if ("singular".equals(num)){
					String con = verb + "ing";
					return con;
				}
				if ("plural".equals(num)){
					String con = verb + "ing";
					return con;
				}
			}
			if (person == 3){
				if ("singular".equals(num)){
					String con = verb + "ing";
					return con;
				}
				if ("singular".equals(num)){
					String con = verb + "ing";
					return con;
				}
			}
		}
		if ("future".equals(tense)){
			if (person == 1){
				if ("singular".equals(num)){
					String con = "will " + verb;
					return con;
				}
				if ("plural".equals(num)){
					String con = "will " + verb;
					return con;
				}
			}
			if (person == 2){
				if ("singular".equals(num)){
					String con = "will " + verb;
					return con;
				}
				if ("plural".equals(num)){
					String con = "will " + verb;
					return con;
				}
			}
			if (person == 3) {
				if ("singular".equals(num)){
					String con = "will " + verb;
					return con;
				}
				if ("plural".equals(num)){
					String con = "will " + verb;
					return con;
				}
			}
		}
		return verb;
	}
    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("Choose a Verb");
		String verb = in.nextLine();
		
		System.out.println("Now choose first, second, or third person (Use numbers EX:1)");
		int person = in.nextInt();
		
		System.out.println("Then choose singular or plural (Use lowercase)");
		String fix = in.nextLine(); //It skips this line of code
		String num = in.nextLine();
		
		System.out.println("Choose whether it is past, present, or future tense (Use lowercase)");
		String tense = in.nextLine();
		
		System.out.println(getPronoun(person, num) + " " + conjugate(verb, person, num, tense));
	}
}