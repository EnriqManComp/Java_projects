import java.util.Stack;
public class MatchingParentheses {

    public void hasMatchParentheses(String text){
        Stack <Character> parenthesesStack = new Stack<>();
        for(int i = 0; i <= text.length()-1; i++){
            if(text.charAt(i) == '('){
                parenthesesStack.push(text.charAt(i));
            }
            else if(text.charAt(i)==')'){
                if(!parenthesesStack.isEmpty()){
                    parenthesesStack.pop();    
                }
                else{
                    parenthesesStack.push('s');
                    break;
                }

            }
        }
        if (parenthesesStack.isEmpty()){
            System.out.println("Match");
        }
        else{
            System.out.println("Not Match");
        }

    }
    
}
