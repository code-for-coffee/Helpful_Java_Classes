// parseMe
// Last updated: 11/28/13 - code-for-coffee 
// https://code-for-coffee.github.com
//
// Use:
// This application is designed to take a CSV document
// and parse it for you to do things with
// IE: PROPERTY [STATUS: OK | FAILED]
// --------------------------------------------

package yourProjectNameHere; // adjust as needed

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author code-for-coffee
 */
public class ParseMe {

    /**
     * @param args the command line arguments
     */
    public static void ParseFile(String fileToParse) {
        
        // variables
        final String strWelcome = "Welcome! Please enter valid file to parse: \n";
        final String strErrorFN = "Oops! It looks like the file you tried to open doesn't exist! Try again.";
        final String strErrorIO = "Oops! It looks like the file you tried to open isn't properly formated (Tab delimited). Try again.";
        final String strGoodbye = "Application completed. Goodbye!\n";
       
        boolean fileVerified = false;
        int numOfLines = 0;
        ArrayList properties = new ArrayList();
        
        // simple ui
        System.out.print(strWelcome);
        Scanner in = new Scanner(System.in);
        fileToParse = in.next();

        try  {
            // try opening
            BufferedReader reader = new BufferedReader(new FileReader(fileToParse));
            String parse = reader.readLine();
            fileVerified = true;
            
            while(parse != null) {
                // add how many lines we're doing
                numOfLines++;
                String configFileName;
                
                // create array to divy up everything
                String[] divy = parse.split("\t");
                              
                // convert to variables to be used
                String item0 = divy[0];
                String item1 = divy[2];
                String item2 = divy[1];
                // String item3 = divy[3]; etc etc
                
                // ok cool, on to the next one
                parse = reader.readLine();
            }
            // close reader
            reader.close();
            
        }
        catch (FileNotFoundException exception) {
            // throw exception for file not found
            System.out.println(strErrorFN);
            fileVerified = false;
        }
        catch (IOException exception) {
            // throw exception for IO
            System.out.println(strErrorIO);
            fileVerified = false;
        }
        finally {
            System.out.print("\n" + strGoodbye);
        }
    }
}
