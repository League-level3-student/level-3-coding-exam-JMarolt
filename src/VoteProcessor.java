import java.util.ArrayList;

public class VoteProcessor {

	public ArrayList<String> calculateElectionWinner(ArrayList<String> list) {
		
		for(int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toLowerCase());
		}
	
		return list;
	}
	
}
