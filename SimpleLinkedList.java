public MyLinkList 
{
  private class Node 
  { 
    private int data; size;
    private Node next ; 
    
    
    Node (int data) 
    {
      this.data = data; 
     }
     
        Node (int data, Node next)
        {
        this.data= data ;
        this.next= next;
        }
        
     
  private Node head ; 
  MyLinkList() {
  }
  MyLinkList(head) 
  {
    this.head=dead; 
  }
  void add(int value)
  {Node number = new Node (value) 
   if (head== null) 
   { 
     head=number;
   }
   if ( value<= head.data)
   number.next=head;
   head= number;
    else 
    { 
      Node run =head;
      
      while (run.next !=null && run.data<=value&& run.next.data>value)
      run= run.next;
      number.next=run.next;
      run.next=number;
      
    }
    size++ ;
    
     int removeFirst()
     {{
     if head == null)
     { return -1; 
     }
     else 
     size--; 
      int data=head.data;
      head= head.next;
      return data;
  }
  int size() 
  {
  return size;
  
  }
     }
  }
  }
}