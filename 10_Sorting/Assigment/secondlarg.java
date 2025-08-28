package Assigment;

public class secondlarg {
    // public static int seclarg(int arr[]){
    //     if (arr.length==0) {
    //         return Integer.MIN_VALUE;
            
    //     }
    //     int largest=arr[0];
    //     int secLarg=Integer.MIN_VALUE;
    //     for(int i=0; i<arr.length; i++){
    //         if (largest<arr[i]) {
    //             secLarg=largest;
    //             largest=arr[i];
                
    //         }else if (secLarg<arr[i] && arr[i]!=largest) {
    //             secLarg=arr[i];
                
    //         }
    //     }
    //     return secLarg;
    // }
    // public static void main(String[] args) {
    //     int arr[]={1,2,3,4};
    //     System.out.print(seclarg(arr));
    // }
    public static int seclarg(int arr[]){
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        if (arr.length==0) {
            return Integer.MIN_VALUE;
            
        }
        for(int i=0; i<arr.length; i++){
            if (max<arr[i]) {
                secmax=max;
                max=arr[i];
            }else if (arr[i]>secmax && arr[i]!=max) {
                secmax=arr[i];

            }

        }return secmax;
    }


    public static void main(String[] args) {
        int arr[]={1,2,4,3,5,745,87,5};
        System.out.println(seclarg(arr));
    }

}
