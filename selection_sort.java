import java.util.Arrays;
public class selection_sort {
    public static void main(String[]args){
        int arr[]={5,4,1,3,2};
        selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            int smallest=arr[i];
            int small_pos=i;
            for(int j=i;j<arr.length;j++){
                if(smallest<arr[j]){
                    smallest=arr[j];
                    small_pos=j;
                }
            }
            arr[small_pos]=arr[i];
            arr[i]=smallest;
        }
    }
}
