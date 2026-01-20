public class Stack{
 static class stack{
    public static Node head;
    public static void push(int data){
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
 static class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
        next=null;
    }
 }
 public static void main(String[]args){
    stack st=new stack();
    st.push(4);
    st.push(3);
    st.push(2);
    st.push(1);
    while(st.head!=null){
        System.out.println(st.pop());
    }
 }
}