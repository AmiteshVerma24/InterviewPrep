import java.util.Scanner;

class stack {
    // Variables required for Implementation of stack
    int[] stack;
    int top;
    // Constructor
    public stack(int size){
        this.stack = new int[size];
        this.top = -1;
    }
    // To check if the stack is full
    public boolean isFull(){
        if(this.top == this.stack.length - 1){
            return true;
        }
        return false;
    }
    // To check if the stack is empty or not
    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }
    // Method to push an element in stack
    public boolean push(int data){
        if(isFull()){
            System.out.println("Cannot perform push operation as the stack is full.");
            return false;
        }
        System.out.format("Pushed %d into stack.",data);
        this.top = this.top + 1;
        this.stack[this.top] = data;
        return true;
    }
    // Method to pop an element from the stack
    public boolean pop(){
        if(isEmpty()){
            System.out.println("Cannot pop an element as the stack is empty.");
            return false;
        }
        System.out.format("The element to be poped is %d",stack[top]);
        this.top = this.top - 1;
        return true;
    }
    // Method to see the top element
    public int top(){
        System.out.format("The element at top of stack is %d.",stack[top]);
        return stack[top];
    }
    // Method to display the stack
    public void display(){
        System.out.println("The stack is:- ");
        for(int i = this.top ; i >= 0 ; i--){
            System.out.format("%d\n",this.stack[i]);
        }
    }
    // Main method
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);       
        int choice,element,size,isContinue = 1;
        // New stack object
        System.out.print("Enter the size of the stack:- ");
        size = sc.nextInt();
        stack stk = new stack(size);
        while(isContinue == 1){
            System.out.print("\n***************************************************");
            System.out.print("\nWhat would you like to do?\n 1. Push\n 2. Pop\n 3. Peek\n 4. Display\n 5. Exit\n Enter your choice:- ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("\nEnter the element to be pushed:- ");
                    element = sc.nextInt();
                    stk.push(element);
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    element = stk.top();
                    break;
                case 4:
                    stk.display();
                    break;
                case 5:
                    isContinue = 0;
                    break;
                default:
                    System.out.println("INVALID CHOICE!");
            }
        }
    }
}
