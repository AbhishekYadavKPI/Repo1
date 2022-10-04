package lambdapractice;

import java.util.HashMap;
import java.util.Map;


interface Stable{
	void Find(String s);
	
}
public class Asylum {
	public static void main(String args[]) {
		//Scanner sc = new Scanner(System.in);
		Map<String,String> members = new HashMap<String,String>();
		// y represents Mentally stable and vice versa
		members.put("Old1", "n");
		members.put("Old2", "y");
		members.put("Old3", "n");
		members.put("Old4", "n");
		members.put("Boy1", "n");
		members.put("Boy2", "n");		
		members.put("Boy3", "n");
		members.put("Boy4", "y");
		/*
		 * System.out.println("Enter the old members and their Mental Stability(Y/N)");
		 * for(int i= 0;i<4;i++) { members.put(sc.next(),sc.next()); }
		 * System.out.println("Enter the boy members and their Mental Stability(Y/N");
		 * for(int i= 0;i<4;i++) { members.put(sc.next(),sc.next()); }
		 * System.out.println(members);
		 */
		
		System.out.println("The mentally stable patients released are:");
		//for(Map.Entry<String, String> entry:members.entrySet()) {
			//if(entry.getValue()== "y") {
				//System.out.println(entry.getKey());
			//}

		members.forEach((k,v)-> {if (v=="y")System.out.println(k);});
		

}}

