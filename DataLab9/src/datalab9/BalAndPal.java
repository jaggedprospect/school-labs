package datalab9;

/**
 * Data Structures Lab 9
 * 03/28/19
 * 
 * @author Nate Heppard
 */

import java.util.Stack;

public class BalAndPal{

    public static void main(String[] args){
        //String for balance testing
        String a="{{{{}}}}";
        String b="{{{{}}}";
        String c="{}{}{}{}{}{}{}{}";
        String d="}{{{}}}";

        //Strings for palindrome testing
        String e="A man, A plan, A canal: Panama";
        String f="Madam I'm Adam";
        String g="tacocat";
        String h="this is not a palindrome";

        System.out.println(isBalanced(a));
        System.out.println(isBalanced(b));
        System.out.println(isBalanced(c));
        System.out.println(isBalanced(d));
        System.out.println();

        System.out.println(isPal(e));
        System.out.println(isPal(f));
        System.out.println(isPal(g));
        System.out.println(isPal(h));
        System.out.println();

        System.out.println(isPalLettersOnly(e));
        System.out.println(isPalLettersOnly(f));
        System.out.println(isPalLettersOnly(g));
        System.out.println(isPalLettersOnly(h));
    }

    public static boolean isBalanced(String toTest){
        Stack<Character> s=new Stack<>(); // create the stack!
        
        for(int x=0;x<toTest.length();x++){ // run the loop for the str length
            char ch=toTest.charAt(x);
            
            if(ch=='[' || ch=='(' || ch=='{') // check for open bracket
                s.push(ch);
            else if(ch==']'){ // check for unnecessary close bracket
                if(s.isEmpty() || s.pop()!='[')
                    return false;
            }else if(ch==')'){
                if(s.isEmpty() || s.pop()!='(')
                    return false;
            }else if(ch=='}'){
                if(s.isEmpty() || s.pop()!='{')
                    return false;
            }
        }
        
        return s.isEmpty(); // true==balanced, false==unbalanced
    }

    
    public static boolean isPal(String toTest){
        Stack<Character> s=new Stack<>(); // create the stack!
        
        for(int x=0;x<toTest.length();x++)
            s.push(toTest.charAt(x)); // add chars to stack
        
        String reverse=""; // create str to hold reverse 
        
        while(!s.isEmpty()) 
            reverse=reverse+s.pop(); // add chars from stack to reverse
        
        return reverse.equals(toTest); // true==strict palindrome, false==not
    }

    public static boolean isPalLettersOnly(String toTest){
        Stack<Character> s=new Stack<>(); // create the stack!
        
        // use regex to replace all non-alphabetical chars + spaces
        toTest=toTest.replaceAll("[^a-zA-Z]","").toLowerCase();
        
        for(int x=0;x<toTest.length();x++)
            s.push(toTest.charAt(x)); // add chars to stack
        
        String reverse=""; // create str to hold reverse
        
        while(!s.isEmpty())
            reverse=reverse+s.pop(); // add chars from stack to reverse
        
        return reverse.equals(toTest); // true==letter palindrom, false==not
    }

}


