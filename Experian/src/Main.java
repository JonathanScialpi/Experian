/**
 * Created by Jonathan Scialpi on 3/26/2017.
 */
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.util.Iterator;

public class Main {

    public double evaluate(Iterator<Character> expressionItr) throws Exception{
        // build a string from the characters we iterate over
        StringBuilder sb = new StringBuilder();
        while(expressionItr.hasNext()){
            sb.append(expressionItr.next());
        }
        String equation = sb.toString();

        //pass this string to the JavaScript evaluator for processing
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        return Double.parseDouble(engine.eval(equation).toString());
    }

}
