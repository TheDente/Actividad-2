import java.io.BufferedReader;
import java.io.IOException;;
import java.io.InputStreamReader;

public class Palindrome
{

    public static boolean isPalindrome(String word)
    {
        int inc = 0;
        int des = word.length()-1;
        boolean bError = false;
    
    while ((inc<des) && (!bError)){
 
	if (word.charAt(inc)==word.charAt(des)){				
		inc++;
		des--;
	  } else {
		bError = true;
	         }
    }

    }

    public static void main(String[] args) {

        String message = null;

        if (args.length == 0) {

            BufferedReader reader = null;

            try {

                reader = new BufferedReader(new InputStreamReader(System.in));

                System.out.print("Enter a message << ");
                message = reader.readLine();

            } catch (IOException e) {

                return;

            }
        } else {

            message = args[0];

        }

        if (isPalindrome(message)) {
            System.out.println("Es Palindromo");
        } else {
            System.out.println("No es palindromo");
        }

    }

}
