public class Main{
 public static void main(String[]args){
    Stack2 st=new Stack2();
    st.push(4);
    st.push(3);
    st.push(2);
    st.push(1);
    while(st.head!=null){
        System.out.println(st.pop());
    }
 }
}
 class Stack2{
    public static Node head;
    public void push(int data){
        Node neWNode=new Node(data);
        if(head==null){
            head=neWNode;
            return;
        }
        neWNode.next=head;
        head=neWNode;
    }
    public static int pop(){
        if(head==null){
            return -1;
        }
        int top=head.data;
        head=head.next;
        return top;
    }
    public static int peek(){
        if(head==null){
            return -1;
        }
        return head.data;
    }
}
class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        next=null;
    }
}

