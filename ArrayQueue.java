
/**
 * Write a description of class ArrayQueue here.
 * 
 * @author (SoniNikita) 
 * @version (a version number or a date)
 */
public class ArrayQueue implements queue
{
   private int front=-1;
   private int rear=-1;
   public static final int default_size =1000;
   private int user_size ;
   private Object a[];
   public ArrayQueue()
   {
    this(default_size);
   
    }
   public ArrayQueue(int s)
   {
       user_size=s;
       a=new Object[user_size];
    }
    
   
   public boolean isEmpty() 
   {
       if (front==-1 && rear==-1)
       {
       return true;
    }
    else
    return false;
       
       
    }
   public boolean isFull() 
   {
       if((front==0  && rear==user_size-1)|| (front==rear+1))
       return true;
       else
       return false;
       
       
    }
   public int size()
   {
       int a= (user_size-(front+rear)% user_size);
       return a;
       
    }
    
   public void enqueue( Object element) throws QueueFullException
   {
     if (front==-1 &&rear==-1)
     {
        front=0; rear=0;
        }
        else  if (isFull()) {
        throw new  QueueFullException("Queue is Full");
        
        }
     // else if(rear==user_size-1)
      //  rear=0;
       else
       
        rear=(rear+1)%user_size;
        a[rear]=element;
    
    }
   public Object dequeue() throws QueueEmptyException
   { if (isEmpty())
       {
        throw new QueueEmptyException("empty queue");
        }
        else
        {
       Object x= a[front];
       a[front]=null;
      if(front==rear)
      {
          front=-1; rear=-1;
       }
       else
       front=(front+1)%user_size;
       return x;
    }
        
       
       
    }
   public Object peek() throws QueueEmptyException
   {
       if (isEmpty())
      
       throw new QueueEmptyException("empty queue");
       else
       return a[front];
       
    }
}






