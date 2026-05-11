package CO4;
class Fibonacci implements Runnable{
    int n;
    Fibonacci(int lim){
        n=lim;
    }
    public void run(){
        int a=0,b=1,c;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
            
        }
    }
}
class Even implements Runnable{
    int a,b;
    Even(int start,int end){
        a=start;
        b=end;
    }
    public void run(){
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println("Even= "+i);
            }
        }
    }
}
public class Runnable_Interface {
    public static void main(String args[]){
        Thread f=new Thread(new Fibonacci(5));
        Thread e=new Thread(new Even(2, 12));
        f.start();
        e.start();
    }
    
}
