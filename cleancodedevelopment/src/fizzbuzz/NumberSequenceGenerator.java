package fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class NumberSequenceGenerator {

	public static List<Integer> generate(int start, int end) {
		ArrayList<Integer> seq = new ArrayList<>();
		for(int i = start; i <= end; i++) {
			seq.add(i);
		}
		return seq;
	}

}
