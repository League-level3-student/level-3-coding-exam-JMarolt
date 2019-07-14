import java.util.ArrayList;

public class VoteProcessor {

	public String calculateElectionWinner(ArrayList<String> list) {

		String one = "";
		String two = "";
		int oneNum = 0;
		int twoNum = 0;

		for (int i = 0; i < list.size(); i++) {
			list.set(i, list.get(i).toLowerCase());
		}
		one = list.get(0);

		for (int k = 0; k < list.size(); k++) {
			if (list.get(k) != one) {
				two = list.get(k);
			}
		}

		for (int g = 0; g < list.size(); g++) {
			if (list.get(g).equals(one)) {
				oneNum = oneNum + 1;
			}
			if (list.get(g).equals(two)) {
				twoNum = twoNum + 1;
			}
		}
		if (oneNum > twoNum) {
			return one;
		} else if (twoNum > oneNum) {
			return two;
		} else {
			return "TIE";
		}

	}

}
