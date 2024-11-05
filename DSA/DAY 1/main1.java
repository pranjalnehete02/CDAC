import java.util.Scanner;

public class main1{
public static int deleteFromPosition(int[] arr, int n, int pos){

    if(pos > n-1){
        return n;
    }

    for(int i = 0; i < n; i++){
        if(i == pos){
            arr[i] =  arr[i+1];
        }
    }

    return n- 1;
    
}

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Enter the posotion: ");
        int pos = sc.nextInt();


        int finalArr = deleteFromPosition(arr, n, pos);
        System.out.println(finalArr);
        sc.close();
        
    }
}

