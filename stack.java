
/**
 * Write a description of interface stack here.
 * 
 * @author (SoniNIkita) 
 * @version (8/22/2015)
 */
public interface stack
{
    /**
     * An example of a method header - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the result produced by sampleMethod 
     */
    public int size();
    public boolean isEmpty();
    
    public Object top() throws StackEmptyException;
    public void push(Object Element)throws StackFullException;
    public Object pop()throws StackEmptyException; 
    
    
    
}


