package parsingExceptions;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.ParseCancellationException;

import java.util.ArrayList;
import java.util.List;

public class CustomErrorListener extends BaseErrorListener {

    public static final CustomErrorListener INSTANCE = new CustomErrorListener();
    public static final List<ParseCancellationException> errors = new ArrayList<ParseCancellationException>();
    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e)
            throws ParseCancellationException {
        if(offendingSymbol != null) {
            int tokenType = ((Token) offendingSymbol).getType();
            String tokenName = recognizer.getVocabulary().getDisplayName(tokenType);
            errors.add(new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg + "; unexpected token " + tokenName));
        }else

            errors.add(new ParseCancellationException("line " + line + ":" + charPositionInLine + " " + msg));
    }
}
