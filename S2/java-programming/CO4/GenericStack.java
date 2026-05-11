package CO4;
import java.util.*;

class stack<T>{
    int top=-1;
    int size=5;
    Object arr[]=new Object[size];
    void push(T data){
        if(top==size-1){
            System.out.println("Stack is full!");
        }
        else{
            top++;
            arr[top]=data;
            System.out.println(data+"is pushed!");
        }

    }
    void pop(){
        if(top==-1){
            System.out.println("Stack is empty!");
        }
        else{
            System.out.println(arr[top]+"is popped!");
            top--;
        }
    }

    void display(){
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+"\t");
        }
    }
}

public class GenericStack {
    public static void main(String args[]){

        int ch,val;
        stack<Integer> s=new stack<Integer>();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("1.push 2.pop 3.display 4.exit");
            ch=sc.nextInt();
            switch(ch){
                case 1:System.out.println("Enter the val to be inserted= ");
                       val=sc.nextInt();
                       s.push(val);
                       break;
                case 2:s.pop();
                        break;
                case 3:s.display();
                        break;
                case 4:System.out.println("exiting.....");
                        break;
                default:System.out.println("Inavlaid Choice!");

            }
        }while(ch!=4);

    }
    
}
