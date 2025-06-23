// Find Min Max number from array
class Main {
    public static void main(String[] args) {
        int[] arr = {3};
        int min = arr[0];
        int max = arr[0];
        if(arr.length>1){
            for(int i=0;i<arr.length;i++){
                if(min > arr[i]){
                    min = arr[i];
                }
                if(max < arr[i]){
                    max = arr[i];
                }
            }
             System.out.println("Min : "+min+" Max : "+max);
        }
        else{
                System.out.println("Array length should be more than 2 elements");
        }
    }
