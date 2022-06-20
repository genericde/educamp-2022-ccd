package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class RangeGenerator {

	public static List<Integer> generate() {
		int start = 1;
		int end = 100;
		ArrayList<Integer> seq = new ArrayList<>();
		for(int i = start; i <= end; i++) {
			seq.add(i);
		}
		return seq;
	}

}
