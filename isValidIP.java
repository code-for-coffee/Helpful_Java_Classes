//  isValidIP
//  Last updated: 11/28/13 - code-for-coffee 
//  https://code-for-coffee.github.com
//
//  Use: 
//  Send a String to validate() to verify if
//  the String is a valid IP address. Returns
//  Boolean.
//
//  Released under the MIT License
//  james@codeforcoffee.org, 2013
//  See Readme file for more info.
//
// --------------------------------------------

package yourPackageNameHere; // adjust as needed

/**
 *
 * @author jtraver
 */
public class validate {
    
    // ip
    public boolean testIP(String IP) {
        boolean results;
        if (IP.matches("^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}$")) {
            results = true;
        }
        else {
            results = false;
        }
        return results;
    }
}
