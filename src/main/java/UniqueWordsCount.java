
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UniqueWordsCount {
	private static Logger log = LogManager.getLogger(UniqueWordsCount.class.getName());

	public static void main(String[] args) throws IOException {
		String lines = FileUtils.readFileToString(new File("C:\\Users\\archa\\OneDrive\\Desktop\\file.txt"),
				Charset.defaultCharset());
		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] words = lines.toLowerCase().replaceAll("[^a-zA-Z1-9\\-\\' ]", "").split(" ");

		for (String word : words) {
			if (map.containsKey(word)) {
				map.put(word, (map.get(word) + 1));
			} else
				map.put(word, 1);
		}

		/*
		 * int uniqueCount = 0;
		 * 
		 * for (Map.Entry<String, Integer> entry : map.entrySet()) { if
		 * (entry.getValue() == 1) { log.info(entry.getKey()); uniqueCount++; }
		 * 
		 * }
		 * 
		 * log.info(uniqueCount);
		 */

		FileUtils.writeStringToFile(new File("C:\\Users\\archa\\OneDrive\\Desktop\\output.txt"), String.valueOf(map),
				"UTF-8");

	}

}
