
public interface queue
{
   public boolean isEmpty() ;
   public boolean isFull() ;
   public int size();
   public void enqueue( Object element) throws QueueFullException;
   public Object dequeue() throws QueueEmptyException;
   public Object peek() throws QueueEmptyException;
   
}
