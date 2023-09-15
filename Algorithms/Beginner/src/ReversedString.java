import java.util.Scanner;
public class ReversedString {
    /* CHALLENGE
     * Input: string
     * Output: new string with each word reversed
     * Assumptions: No punctuation in the string; each word separated by spaces     * 
     */
    private String inputString = null;

    public void getString(){
        Scanner input = new Scanner(System.in);
        inputString = input.nextLine();
        input.close();       
    }
    public String reversed1(){
        // Iterative method
        if (inputString == null || inputString.isEmpty()){
            return "No text introduced";
        }
        else{
            StringBuilder sb = new StringBuilder();
            for(int i = inputString.length()-1;i>=0;i--){
                sb.append(inputString.charAt(i));
            }
            return sb.toString();
        }

    }
    public String reversed2(){
        // Using StringBuilder
        if(inputString == null || inputString.isEmpty()){
            return "No text introduced";
        }
        else{
            StringBuilder sb = new StringBuilder(inputString);
            return sb.reverse().toString();
        }
    }


    
}





    
    

 