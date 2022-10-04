package lambdapractice;

import java.util.ArrayList;
import java.util.List;

interface TestForEach {
	void print(List test);
	//default void test() {}
	
}
public class Games {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hockey");
		gamesList.add("Volleyball");
		gamesList.add("Rugby");
		
		gamesList.forEach(games-> System.out.println(games));
		//TestForEach tfe = games -> System.out.println(games);
	
	}

}
