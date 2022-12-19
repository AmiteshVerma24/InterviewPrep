package b_queue;
import java.util.Scanner;

class queue{
    // Scanner object to take input
    Scanner sc = new Scanner(System.in);
    // Variables
    int size, rear = -1 , front = -1;
    int arr[];
    // Constructor
    public queue(){
        System.out.print("\nEnter the size of the queue:- ");
        this.size = sc.nextInt();
        this.arr = new int[this.size];
    }
    // Is empty
    boolean isEmpty(){
        if (front == -1 && rear == -1){
            return true;
        }
        return false;
    }
    // Is full
    boolean isFull(){
        if (rear == this.size - 1){
            return true;
        }
        return false;
    }
    // Enqueue
    void enqueue(int x){
        if (isFull()){
            System.out.println("Can't enter queue is full.");
        }else if(isEmpty()){
            this.front = 0;
            this.rear = 0;
        }else{   
            this.rear++;
        }
        this.arr[this.rear] = x;
    }
    // Dequeue
    void dequeue(){
        if (isEmpty()){
            System.out.println("Can't remove as queue is empty");
        }
        else if (this.rear == this.front){
            this.front = this.rear = -1;
        }
        else{
            System.out.format("\nThe removed element is:- %d \n", this.arr[this.front]);
            this.front = this.front + 1;
        }
    }
    // Display
    void display(){
        System.out.print("\nTHE QUEUE IS:- ");
        if (isEmpty()){
            System.out.println("EMPTY QUEUE!");
        }
        else{
            for (int i = this.front ; i <= this.rear ; i++){
                System.out.format(" %d ", this.arr[i]);
            }
        }
        System.out.println("\n");
    }
}

public class implementationOfQueue {
    public static void main(String[] args) {
        queue q = new queue();
        Scanner sc = new Scanner(System.in);
        // Choice of user
        int choice, isContinue = 0;
        while (isContinue == 0){
        System.out.print("\nWhat would you like to do? \n 1. ENTER \n 2. REMOVE \n 3. DISPLAY \n 4. EXIT \n\nEnter your choice:- ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.print("\nEnter the element to be pushed:- ");
                int num = sc.nextInt();
                q.enqueue(num);
                break;
            case 2:
                q.dequeue();
                break;
            case 3:
                q.display();
                break;
            case 4:
                isContinue = 1;
                break;
            default:
                System.out.println("INVALID CHOICE");
            
            }
        } 
    }
}
