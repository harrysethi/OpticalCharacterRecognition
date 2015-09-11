/**
 * 
 */
package helper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import domain.Globals;
import domain.Potentials;

/**
 * @author harinder
 *
 */
public class IO {
	public static void readPotentials(String ocrFilePath, String transFilePath)
			throws IOException {
		readOcrPotentials(ocrFilePath);
		readTransPotentials(transFilePath);
	}

	public static void readWordsAndImages(String wordDatPath,
			String imageDatPath) throws IOException {
		readWordsDat(wordDatPath);
		readImagesDat(imageDatPath);
	}

	private static void readOcrPotentials(String filePath) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));

		String line = br.readLine();

		while (line != null) {
			StringTokenizer st = new StringTokenizer(line);
			Potentials.addOcrPotentialEntry(st.nextToken(), st.nextToken(),
					st.nextToken());
			line = br.readLine();
		}

		br.close();
	}

	private static void readTransPotentials(String filePath) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));

		String line = br.readLine();
		while (line != null) {
			StringTokenizer st = new StringTokenizer(line);
			Potentials.addTransPotentialEntry(st.nextToken(), st.nextToken(),
					st.nextToken());
			line = br.readLine();
		}

		br.close();
	}

	private static void readWordsDat(String filePath) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));

		String line = br.readLine();
		while (line != null) {
			Globals.words.add(line.trim());
			line = br.readLine();
		}

		br.close();
	}

	private static void readImagesDat(String filePath) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(filePath));

		String line = br.readLine();
		while (line != null) {
			StringTokenizer st = new StringTokenizer(line);
			
			List<String> imageIds = new ArrayList<String>();
			while(st.hasMoreElements()){
				imageIds.add(st.nextToken());
			}
			Globals.images.add(imageIds);
			line = br.readLine();
		}

		br.close();
	}
}
