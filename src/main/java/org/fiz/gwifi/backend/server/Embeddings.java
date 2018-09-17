package org.fiz.gwifi.backend.server;
import java.util.Collection;
import java.util.List;

import org.deeplearning4j.models.embeddings.loader.WordVectorSerializer;
import org.deeplearning4j.models.word2vec.Word2Vec;
import org.fiz.ise.gwifi.Singleton.LINE_modelSingleton;
import org.fiz.ise.gwifi.util.Config;
import org.fiz.ise.gwifi.util.URLUTF8Encoder;
import org.nd4j.linalg.api.ndarray.INDArray;

import edu.kit.aifb.gwifi.model.Category;


public class Embeddings 
{

	public static void load() {
		System.out.println("I am in load");
		LINE_modelSingleton.getInstance();
	}
	public static String getMostSuitableCategory(String text) {
//		System.out.println("input: " + text);
//		System.out.println("decoded: " + URLUTF8Encoder.decode(text));
		return ProcessClassifyText.classifyText(URLUTF8Encoder.decode(text));
	}
	public static Object getMostSuitableCategoryList(String text) {
		// TODO Auto-generated method stub
		return ProcessClassifyText.classifyTextGetCategories(URLUTF8Encoder.decode(text));
	}
	public static List<String> getMentions(String text) {
		// TODO Auto-generated method stub
		return ProcessClassifyText.classifyTextGetMentions(URLUTF8Encoder.decode(text));
	}

}

