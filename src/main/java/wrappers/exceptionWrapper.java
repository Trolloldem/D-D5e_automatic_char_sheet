package wrappers;

public class exceptionWrapper implements semanticResult{

    Exception wrapped;

    public exceptionWrapper(Exception e){
        wrapped = e;
    }

    @Override
    public String toString() {
        return wrapped.toString();
    }
}
