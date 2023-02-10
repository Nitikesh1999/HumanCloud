package DSAImplemenation;

public class Linklist {
    private Node head;
    private Node tail;
    private int size;


    public Linklist() {
        this.size = 0;

    }
    public void InsertLast(int val){
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertParticular(int val,int index){
        if(index == 0){
            FirstInsertion(val);
            return;
        }if(index == size){
            InsertLast(val);
            return;

        }
        Node temp = head;
        for (int i =1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public void DeleteFirst(){
        try {
            head = head.next;
            System.out.println(head.val+"Deleted Successfully");
        }catch (Exception e){
            System.out.println("Array is empty first add the element");
        }

        if(head == null){
            tail = null;

        }
        size--;

    }
//    public int deleteParticular(int index){
//        if(index == 0){
//            DeleteFirst();
//        }if(index == size-1){
//            Deletelast();
//        }
//        Node prev = getIndex(index-1);
//        int value = prev.next.val;
//        prev.next = prev.next.next;
//        return value;
//
//    }

    public Node getIndex(int index){
        Node node = head;
        for(int i =1;i<index;i++){
            node = node.next;
        }
        return node;
    }
//    public int Deletelast(){
//        if(size<=1){
//            return Integer.parseInt(DeleteFirst());
//        }
//        Node secondLast = getIndex(size - 2);
//        int value = tail.val;
//        tail = secondLast;
//        tail.next = null;
//        return value;
//    }
    public void FirstInsertion(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;

        }else{
            tail.next = node;
            tail = node;
        }
        size++;
    }
    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.val +"->");
            temp = temp.next;

        }
        System.out.println("End");
    }
    private class Node{
        private int val;
        private Node next;


        public Node(int val) {

            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}
