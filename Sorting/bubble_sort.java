import java.util.Arrays;
public class bubble_sort {
    public static void main(String[] args) {
        int arr[]={4,6,2,3,4,7};
        bubble_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int k=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[k]>arr[j]){
                   int temp=arr[k];
                   arr[k]=arr[j];
                   arr[j]=temp;
                }
                k++;
            }
        }
    }
}
