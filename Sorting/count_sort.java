import java.util.Arrays;
public class count_sort{
    public static void main(String[]args){
        int arr[]={1,2,2,4,6,4,1,5};
        count_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void count_sort(int arr[]){
        int largest=Integer.MIN_VALUE;
        //finding the largest value
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //storing the frequency
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i< count.length;i++){
            while(count[i]>0){
                arr[j++]=i;
                count[i]--;
            }
        }
   }
}