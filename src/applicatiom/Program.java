package applicatiom;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInt = Arrays.asList(5, 2, 10);
		printList(myInt);

		List<String> myStr = Arrays.asList("Maria", "Ana", "João");
		printList(myStr);
	}

	private static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}

	}

}
