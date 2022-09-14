import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import org.junit.Test;

public class BlobTest {

	//creates file with name and contents
	private void createFile(String name, String contents) throws IOException {
		File file = new File(name);	
		FileWriter fw = new FileWriter("objects/"+ file);
		fw.write(contents);
		fw.close();
	}
	
	@Test
	public void testBlob() throws NoSuchAlgorithmException, IOException {
		createFile("test.txt", "contents");
		Blob test = new Blob("test.txt");
		assertTrue(File.exists(test.getSha1()));
	}

	@Test
	public void testGetSha1() {
		fail("Not yet implemented");
	}
}
