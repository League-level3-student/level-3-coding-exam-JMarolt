import java.util.HashMap;

public class HashMapCalculator {

	public int commonKeyValuePairs(HashMap<String, String> one, HashMap<String, String> two) {

		int num = 0;
		
		if(one.entrySet().equals(two.entrySet())){
			num = num + 1;
		}

		return num;

	}

}
