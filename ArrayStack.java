
/**
 * Write a description of class ArrayStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayStack implements stack
{
    private int top=-1;
    public static final int default_capacity =1000;
    private int capacity ;
    public Object a[];
    public ArrayStack()
    {
        this(default_capacity);
    }
    public ArrayStack(int c)
    {
        capacity=c;
        a= new Object[c];
        
    }
    
    public int size(){
        return(top+1);
    }
    public boolean isEmpty(){
        if(top<0)
        return(true);
        else 
        return(false);
        
    }
    
    public Object top() throws StackEmptyException{
      if(isEmpty())
      {
          throw new StackEmptyException("Stack Empty");
        
        }
        else{
        return a[top];
      
    }
     
    }
    
    public void push(Object Element)throws StackFullException
    {
    if(top+1==capacity)
    {
        throw new StackFullException("Stack is full");
    }
    else
    {
    top++;
    a[top]=Element;
}
}
    
    
    public Object pop()throws StackEmptyException
    {
        if(isEmpty())
        {
        throw new StackEmptyException("Stack Empty");
        
        }
        else
        {
            Object x;
            x=a[top];
            a[top--]=null;
           return x;
        }
    
    
    }
    
    
    
}
