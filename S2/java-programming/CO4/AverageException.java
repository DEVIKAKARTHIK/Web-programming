package CO4;
import java.util.Scanner;
public class AverageException {
    public static void main(String args[]){
        int n;
        int num[];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elems= ");
        n=sc.nextInt();
        System.out.println("Enter "+n+" integers= ");
        num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
            try{
                if(num[i]<0) throw new NegativeException("Negative number is not allowed! ");
                else{
                    sum+=num[i];
                }
            }
            catch(NegativeException e){
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
        System.out.println("Average= "+sum/n);
    
    }
    }
    class NegativeException extends RuntimeException{
        NegativeException(String s){
            super(s);
        }
    }

