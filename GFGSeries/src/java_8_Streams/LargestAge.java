package java_8_Streams;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LargestAge {

	public static void main(String[] args) {
		Map<String,Integer> mp= new HashMap<>();
		mp.put("Ansh", 21);
		mp.put("Ansh1", 29);
		System.out.println(	mp.entrySet().stream().
				sorted(Comparator.comparing(Map.Entry<String,Integer>::getValue)
						.reversed()).map(e->e.getKey()).findFirst().get());
	
	}

}
