import java.util.Scanner;

public class ReverseRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int b= sc.nextInt();
        int c= sc.nextInt();
        reversRange(array,b,c);
        for(int i=0;i<n;i++){
            System.out.println(array[i]);
        }
    }
    static void reversRange(int array[],int start,int end){
        int i=start,j=end,temp;
        while(i<j){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;j--;
        }
    }
}
