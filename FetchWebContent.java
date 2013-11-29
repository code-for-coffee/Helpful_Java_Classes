package fetchwebcontent;
import fetchWebContent.fetchWebAssets; 
import java.io.IOException;

/**
 *
 * @author jtrave1@wgu.edu
 */
public class FetchWebContent extends fetchWebAssets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        fetchWebAssets Test = new fetchWebAssets();
        Test.fetchAssets("http://google.com", "q", "java", "output", "search");
        Test.fetchAssets("http://bing.com/search", "q", "java", "form", "QBLH&pq");
    }
    
}
