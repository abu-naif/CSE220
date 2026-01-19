import java.util.Arrays;
public class sort_test {
    public static void main(String[]args){
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        int arr1[]={3,6,2,1,8,7,4,5,3,1};
        int arr2[]={3,6,2,1,8,7,4,5,3,1};
        selection_sort(arr2);
        System.out.println(Arrays.toString(arr2));
        int arr3[]={3,6,2,1,8,7,4,5,3,1};
        bubble_sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
    public static void insertion_sort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            for(int j=i-1;j>=0;j--){
                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }else{
                    break;
                }
            }

        }
    }
    public static void count_sort(int arr[]){
        // counting the largest number..
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        //frequency checking..
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //sorting..
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j++]=i;
                count[i]--;
            }
        }
    }
    public static void selection_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallest=arr[i];
            int small_pos=i;
            for(int j=i;j<arr.length;j++){
                if(smallest>arr[j]){
                    smallest=arr[j];
                    small_pos=j;
                }
            }
            arr[small_pos]=arr[i];
            arr[i]=smallest;
        }
    }
    public static void bubble_sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
