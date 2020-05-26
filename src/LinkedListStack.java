public class LinkedListStack {
    Node head;

    class Node{
        int value;
        Node next;
    }

    LinkedListStack(){
        head = null;
    }

    //push: add value to beginning of the list
    public void push(int value){

        Node extraHead = head;
        head = new Node();
        head.value = value;
        head.next = extraHead;
    }

    //pop:
    public int pop(){
        if(head==null){
            System.out.println("stack is empty");
        }
        int value = head.value;
        head = head.next;
        return value;
    }

    public static void printList(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.value + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedListStack lls = new LinkedListStack();
        //System.out.println(lls.pop());

        lls.push(10);
        lls.push(20);
        lls.push(30);
        lls.push(40);
        lls.push(50);

        System.out.println("Element popped is: "+lls.pop());
        System.out.println("Element popped is: "+lls.pop());

        lls.push(60);

        System.out.println("Element popped is: "+lls.pop());

        printList(lls.head);
    }
}
