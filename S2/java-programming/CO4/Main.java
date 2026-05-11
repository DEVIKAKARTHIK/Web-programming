package CO4;
class Multiple extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i*5);
        }
    }
}
class Prime extends Thread{
    int n;
    Prime(int lim){
        n=lim;
    }
    int isPrime(int n){
        if(n<2){
            return 0;
        }  
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return 0;
            }
        }
        return 1;
    }
    public void run(){
        for(int i=1;i<n;i++){
            if(isPrime(i)==1){
                System.out.println("Prime = "+i);
            }
        }
    }
}
public class Main {
    
}
