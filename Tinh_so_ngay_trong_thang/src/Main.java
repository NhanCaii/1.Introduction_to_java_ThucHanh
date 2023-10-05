
public class Main {
    public static void main(String[] args) {
        int temp=0;
//        int[] arr={0,1,2,2,3,0,4,2};
        int[] arr={2,3,4,5,6};
        for (int j = 0; j < arr.length-1 ; j++) {
            
            if (arr[j]==3){
                for (int i = arr.length-1; i >=0 ; i--) {
                    if(arr[i]!=3){
                        temp=arr[j];
                        arr[j]=arr[i];
                        arr[i]=temp;
                    }
                }
            }
        }

        for (int a: arr) {
            System.out.println(a);
        }



    }
}
