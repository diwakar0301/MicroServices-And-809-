package package3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindOneInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> letters1 = Arrays.asList("a", "b");
		List<String> letters2 = Arrays.asList("b", "c", "d");
		List<String> letters3 = Arrays.asList("e", "f");
		List<List<String>> listOfLetters = Arrays.asList(letters1, letters2, letters3);

		List<String> flatList = listOfLetters.stream()
		        .flatMap(List::stream)
		        .collect(Collectors.toList());
		System.out.println(flatList);
	}

}
