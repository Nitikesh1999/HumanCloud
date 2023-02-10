package DSAImplemenation;

import DSAImplemenation.CustomArrayL;
import DSAImplemenation.QueuesDS;
import DSAImplemenation.DynamicStack;
import DSAImplemenation.Linklist;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.ArrayList");
            System.out.println("2.LinkList");
            System.out.println("3.Stack");
            System.out.println("4.Queue");
            System.out.println("5.Exit");
            System.out.println("Chose any DataStructure");
            int pk;
            switch (pk = sc.nextInt()) {
                case 1:
                    CustomArrayL<Integer> array = new CustomArrayL<>();

                    int n;
                    do {
                        System.out.println("1.Insert\n 2.Insert at particular index \n 3.Delete\n 4.DisplayList");
                        switch (n = sc.nextInt()) {
                            case 1:
                                System.out.println("Enter the element you want to enter:");
                                int len = sc.nextInt();
                                for (int i = 0; i < len; i++) {
                                    array.add(sc.nextInt());
                                }
                                break;
                            case 2:
                                System.out.println("Enter index at which index you want to insert");
                                int index = sc.nextInt();
                                array.get(index);
                                break;
                            case 3:
                                Integer s = array.remove();
                                if(s  != null){
                                    System.out.println(s+" Deleted successfully");
                                }
                                break;
                            case 4:
                                System.out.println(array.toString());
                                break;
                            default:
                                System.out.println("Enter valid choice");

                        }
                        System.out.println("Enter'Y' to continue and 'N' to exit");

                    }
                    while (sc.next().equalsIgnoreCase("Y"));
                    break;
                case 2:
                    Linklist ll = new Linklist();
                    do {
                        System.out.println("1.FirstInsertion\n 2.InsertParticular\n 3.InsertLast\n 4.DeleteFirst12\n 5.Display");
                        switch (n = sc.nextInt()) {
                            case 1:
                                System.out.println("Enter the number of element you want to enter");
                                int len = sc.nextInt();
                                for (int i = 0; i < len; i++) {
                                    ll.FirstInsertion(sc.nextInt());
                                }
                                break;
                            case 2:
                                System.out.println("Enter the data and index at which you want to insert data");
                                ll.insertParticular(sc.nextInt(), sc.nextInt());
                                break;
                            case 3:
                                System.out.println("Enter the element you want to enter:");
                                int d = sc.nextInt();
                                for (int i = 0; i < d; i++) {
                                    ll.InsertLast(sc.nextInt());
                                }
                                break;
                            case 4:
                               ll.DeleteFirst();
                                break;
                            case 5:
                                ll.display();
                                break;


                        }
                        System.out.println("Enter'Y' to continue and 'N' to exit");

                    } while (sc.next().equalsIgnoreCase("Y"));
                    break;
                case 3:
                    DynamicStack stack = new DynamicStack();
                    do {
                        System.out.println("1.Push\n 2.Pop\n 3.Peek\n 4.Display");
                        switch (n = sc.nextInt()) {
                            case 1:
                                System.out.println("Enter the number of element you want to push:");
                                int len1 = sc.nextInt();
                                for (int i = 0; i < len1; i++) {
                                    stack.push(sc.nextInt());
                                }
                                break;
                            case 2:
                                String s =stack.pop();
                                if(s  != null){
                                    System.out.println(s+" Popped Successfully");
                                }
                                break;
                            case 3:
                                System.out.println(stack.peek() + "Peeked Successfully");
                                break;
                            case 4:
                                System.out.println(stack.toString());
                                break;
                        }
                        System.out.println("Enter'Y' to continue and 'N' to exit");
                    } while (sc.next().equalsIgnoreCase("Y"));
                    break;
                case 4:
                    QueuesDS queue = new QueuesDS();
                    do {
                        System.out.println("1. Enqueue \n2. Dequeue \n3. Front \n4. Display");
                        switch (n = sc.nextInt()) {
                            case 1:
                                System.out.println("Enter the number of elements you want to enqueue : ");
                                int len1 = sc.nextInt();
                                for (int i = 0; i < len1; i++) {
                                    queue.enqueue(sc.nextInt());
                                }
                                break;
                            case 2:
                                queue.dequeue();
                                break;
                            case 3:
                                System.out.println(queue.front());
                                break;
                            case 4:
                                queue.display();
                                break;
                        }
                        System.out.println("Enter 'Y' to Continue and 'N' to Exit");
                    } while (sc.next().equalsIgnoreCase("Y"));
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice enter again");

            }
        }
    }
}
