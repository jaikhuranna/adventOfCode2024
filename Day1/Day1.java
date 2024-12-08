import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) throws Exception {
		System.out.println("Historian Hysteria");
		ArrayList<Integer> firstList = new ArrayList<>();
		ArrayList<Integer> secondList = new ArrayList<>();
		File input = new File("/Users/jaikhurana/Developer/adventOfCode2024/Day1/inputday1puzzle1.txt");

		// Read Input File
		Scanner scanner = new Scanner(input);

		//Parse into lists
		while (scanner.hasNextLine()) {
			String[] currLineArr = scanner.nextLine().split("   ");
			firstList.add(Integer.parseInt(currLineArr[0]));
			secondList.add(Integer.parseInt(currLineArr[1]));
		}
		// Sort the filds
		firstList.sort(ascendingOrder);
		secondList.sort(ascendingOrder);

		System.out.println(calculateDistanceAndAdd(firstList, secondList));

		scanner.close();
	}

	static Comparator<Integer> ascendingOrder = new Comparator<Integer>() {
		@Override
		public  int compare(Integer a, Integer b) 
		{
			return a - b;
		}
	}; 

	static Integer calculateDistanceAndAdd(ArrayList<Integer> first, ArrayList<Integer> second)
	{
		Integer distanceSum = 0;
		for (int i = 0; i < first.size(); i++) {
			distanceSum += Math.abs(first.get(i) - second.get(i));
		}
		return distanceSum;
	}
}
