// "static void main" must be defined in a public class.
import java.util.Scanner;
public class rotatingarray {
    public static void main(String[] args) {
       
        /*Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//array size
        int a[]=new int[n];
        for(int k=0;k<n;k++){
            a[k]=sc.nextInt();//getting input for the array
        }*/
        int[] a={1,2,3,4,5,6,7};
        int [] newarr=new int [a.length];//output array
        
        int k=22;
       // int k=sc.nextInt(); getting rotations;
        if(k>=a.length){
            while(k>=a.length){
            k=Math.abs(a.length-k);
            }
        }
        
        int count=0;
        int i=0;
        //performing the rotations
        for(i=a.length-k;i<a.length;i++){
            newarr[count]=a[i];
            count++;
            
        }
        for(i=0;i<a.length-k;i++){
            newarr[count]=a[i];
            count++;
        }
        for(int j=0;j<a.length;j++){///printing the array
            System.out.print(newarr[j]+" ");
            
        }
    }
}
