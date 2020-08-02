package logicals;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Counting_no_of_words_lines_charcter {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = null;
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		reader = new BufferedReader(new FileReader("C:\\tolo.txt"));
		//System.out.println(reader);
		String currentLine = reader.readLine();
		// System.out.println(currentLine);

		while (currentLine != null) {
			System.out.println(currentLine);
			lineCount++;
			String[] words = currentLine.split(" ");
			wordCount = wordCount + words.length;
			for (String word : words) {
				charCount = charCount + word.length();
			}
			currentLine = reader.readLine();
		}
		System.out.println("Number Of Chars In A File : " + charCount);

		System.out.println("Number Of Words In A File : " + wordCount);

		System.out.println("Number Of Lines In A File : " + lineCount);
	}

}
