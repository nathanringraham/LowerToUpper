/* Nathan Ingraham
 * Serial Upper
 * Return entered serial number to uppercase and copy number to clipboard
 * 6/19/17
 */
package javaapplication1;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Scanner;

/**
 *
 * @author nathaningraham
 */
public class JavaApplication1 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user to enter a serial number
        
        System.out.print("\n Paste a serial number: ");
        
        for(int i = 0 ; i < 100000 ;  ){
            String serial = input.next();
           
                
                makeCapital(serial); // call method and pass entered serial number to it.
                
            
             
        }
        
    }
    
    public static void makeCapital(String serialstring){
         try{
             
                
                String serialCap = serialstring.toUpperCase(); //Capitalize passed serial number
                
                StringSelection stringSelection = new StringSelection(serialCap);
                Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipboard.setContents(stringSelection, null); //Set clipboard contents to uppercased serial
                    System.out.println(serialCap + " has  been copied to the clipboard\n" + 
                            "Paste another serial number: "); //Let user know it has been copied
                } catch (Exception e){
                    System.out.println("Failed.."); //print failed if somehow the program fails
                }
    }
        
    
}
