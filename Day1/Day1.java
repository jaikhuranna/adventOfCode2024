import java.io.File;
import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) throws Exception {
		System.out.println("Historian Hysteria");
		File input = new File("/Users/jaikhurana/Developer/adventOfCode2024/inputday1puzzle1.txt");

		// Read Input File
		Scanner scanner = new Scanner(input);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
	}
}
