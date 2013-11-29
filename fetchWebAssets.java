//  fetchWebAssets
//  Last updated: 11/28/13 - code-for-coffee 
//  https://code-for-coffee.github.com
//
//  Use:
//  Fetch the contents of a webpage to be used
//  elsewhere in the project. Returns the source
//  of a webpage back to the application.
// --------------------------------------------

package yourPackageNameHere;        // edit
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author code-for-coffee
 */
public class fetchWebAssets {
    
    public String fetchAssets(String webURI, String param1, String val1, String param2, String val2) throws IOException {
       
        // take the user's input and create a query string
        // query string last verified: 11/28/13
        // feel free to change the Constructor as much as you like for this class/change the queryString
        URL queryString = new URL(webURI + "?" + param1 + "=" + val1 + "&" + param2 + "=" + val2);
        boolean didThisWork = true;
        String output = "";
        String searchedValue = "";
        String err;
        
        try {
            // attempt to open connection to the website
            URLConnection query = queryString.openConnection();
            query.setDoOutput(true);                    
            query.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
            BufferedReader grabContents = new BufferedReader(new InputStreamReader(
                                    query.getInputStream()));
            String tempData;
            while ((tempData = grabContents.readLine()) != null) {
                System.out.print(tempData + "\n");
            }
            grabContents.close();
                       
        }
        catch (IOException Exception) {
            // if application catches an error let us know
            didThisWork = false;
        }
        finally {
            // if the application works...
            if (didThisWork = true) {
                // return URI contents as a String
                System.out.print(output);
                return searchedValue;
            }
            else {
                // return an error message
                err = "Unable to connect to the specified URL. Try again later.";
                System.out.print("(URLConnection Failed)\t" + err);
            }
        }
        return returnedWebContent;
    } 
}
