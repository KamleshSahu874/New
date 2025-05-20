public class ArraySorted {
    public static void main(String[] args) {
        int[] arr ={5,2,8,-1,4,3};
        int index =0;
        int[] newArr =new int[arr.length];
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("sorted array is:");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("sorted array in reverse order is:");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}

