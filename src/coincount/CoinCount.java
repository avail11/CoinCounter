 /*This program will allow collectors to input the coins they have, ut will
show them what they entered, and which coins they need to complete the collection
Alexandrea Vail 
IS221-01
12/12/2017*/
package coincount;

import javax.swing.*;

public class CoinCount {
//Start main method
    public static void main(String[] args){
    String coinEntry;
//Set coinDescriptions
    String[] coinDescription = {"Liberty Cap",
                                "1794",
                                "1795",
                                "1797",
                                "Drapped Bust",
                                "1800",
                                "1802",
                                "1803",
                                "1804",
                                "1804 Spiked Chin",
                                "1805",
                                "1806",
                                "1807",
                                "1808",
                                "1808 8 over 7",
                                "Classic Head",
                                "1809",
                                "1810",
                                "1811",
                                "1825",
                                "1826",
                                "1828 13 stars",
                                "1828 12 stars",
                                "1829",
                                "1832",
                                "1833",
                                "1834",
                                "1835",
                                "Braided Hair",
                                "1849",
                                "1850",
                                "1851",
                                "1853",
                                "1854",
                                "1855",
                                "1856",
                                "1857"


    };
//Determine variables for index and Yes_No_Option
    int[] hasCoin = new int[coinDescription.length];
    int choice = JOptionPane.YES_NO_OPTION;
//User input
    do{
        coinEntry = JOptionPane.showInputDialog(null, "What coin would you like to add to your collection?");


        for(int index = 0; index < coinDescription.length; index++){
            if(coinEntry.equals(coinDescription[index].toLowerCase()))
                hasCoin[index] = 1;
        }

//Loop to continue adding coins
        choice = JOptionPane.showConfirmDialog(null, "Would you like to add another coin? ");
    }while(choice == JOptionPane.YES_OPTION); //


//display coins using user input 
    for(int i = 0; i < coinDescription.length; i++)
        if(hasCoin[i] == 1)
            System.out.println("Has " + coinDescription[i]);
        else System.out.println("Does not have " + coinDescription[i]);   
    }//end of main
    }//end of class 
   
