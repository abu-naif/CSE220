import java.util.Arrays;

public class insertion_sort {
    public static void main(String[]args){
        int arr[]={3,4,2,1,5};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int prev=i-1;
            // finding for insertion and moving to the next slot if the value is lesser 
            while(prev>=0 && temp<arr[prev]){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=temp;
        }
    }
}
