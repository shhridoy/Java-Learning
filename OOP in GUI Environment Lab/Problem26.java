/* 26. (Creating Three-Letter Strings from a Five-Letter Word) Write an application that reads a
five-letter word from the user and produces every possible three-letter string that can be derived from the letters of that word. 
For example, the three-letter words produced from the word “bathe” include “ate,” “bat,” “bet,” “tab,” “hat,” “the” and “tea.”
*/

import java.util.Scanner;

public class Problem26 {
    
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        
	System.out.println("Please enter a five letter word"); 
        String str = input.nextLine();

        for (int i=0; i<str.length(); i++) {             // pos. of 1st letter
            for (int j=0; j<str.length(); j++) {         // pos. of 2nd letter
                for (int k = 0; k < str.length(); k++) {     // pos. of 3rd letter
                    if (i == j || i == k || j == k) {
                        continue;  // any letter taken twice? -> skip
                    }
                    System.out.printf("%c%c%c\n", str.charAt(i), str.charAt(j), str.charAt(k));
                }
            }
        }
	
    }
    
}

/* OUTPUT:
Please enter a five letter word
bathe
bat
bah
bae
bta
bth
bte
bha
bht
bhe
bea
bet
beh
abt
abh
abe
atb
ath
ate
ahb
aht
ahe
aeb
aet
aeh
tba
tbh
tbe
tab
tah
tae
thb
tha
the
teb
tea
teh
hba
hbt
hbe
hab
hat
hae
htb
hta
hte
heb
hea
het
eba
ebt
ebh
eab
eat
eah
etb
eta
eth
ehb
eha
eht
*/
