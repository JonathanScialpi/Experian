import org.junit.Test;

import java.util.*;
import static org.junit.Assert.*;

/**
 * Created by Jonathan Scialpi on 3/27/2017.
 */
public class MainTest {
    Main main = new Main();

    @Test
    public void main() throws Exception {

        //build stack of characters to iterate over
        String eq = "1+2+3+4+5+6-7-8-9+10";
        Stack<Character> myStack = new Stack<>();

        for(int x=0;x<eq.length();x++){
            myStack.push(eq.charAt(x));
        }

        //create and pass the iterator
        Iterator itr = myStack.iterator();
        assertEquals(7.0,main.evaluate(itr),.001);
    }

    @Test
    public void divAndMult() throws Exception {

        //build stack of characters to iterate over
        String eq = "1 + 2 / 5 + 7 * 2 - 5";
        Stack<Character> myStack = new Stack<>();

        for(int x=0;x<eq.length();x++){
            myStack.push(eq.charAt(x));
        }

        //create and pass the iterator
        Iterator itr = myStack.iterator();
        assertEquals(10.4,main.evaluate(itr),.001);
    }

    @Test
    public void parentheses() throws Exception {

        //build stack of characters to iterate over
        String eq = "(1 + 2) / 5 + (7 * 2 - 5)";
        Stack<Character> myStack = new Stack<>();

        for(int x=0;x<eq.length();x++){
            myStack.push(eq.charAt(x));
        }

        //create and pass the iterator
        Iterator itr = myStack.iterator();
        assertEquals(9.6,main.evaluate(itr),.001);
    }

    @Test
    public void nestedParentheses() throws Exception {
        String eq = "(1 + 2) / 5 + (7 * 2 - 5*(900/30))";
        Stack<Character> myStack = new Stack<>();

        for(int x=0;x<eq.length();x++){
            myStack.push(eq.charAt(x));
        }

        //create and pass the iterator
        Iterator itr = myStack.iterator();
        assertEquals(-135.4,main.evaluate(itr),.001);
    }
}