/**
 * 
 */
package test;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import worker.ProbCalc;
import constants.ModelType;

/**
 * @author harinder
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		helper.IO.readPotentials("OCRdataset/potentials/ocr.dat",
				"OCRdataset/potentials/trans.dat");
		String[] imageID_arr = { "3", "5", "4", "7", "99" };
		List<String> imageIDs = Arrays.asList(imageID_arr);
		//System.out.println(ProbCalc.CalculateWordProbability("adoin", imageIDs,
			//	ModelType.OCR_MODEL));

		helper.IO.readWordsAndImages("OCRdataset/data/small/words.dat",
				"OCRdataset/data/small/images.dat");
	}

}
