// import java.util.*;

class WaveArray{
    public static void main(String[] args) {
        int n = 6;
        int[] arr = {10, 12, 14, 90, 112, 100};

        for(int i=0, j=1; i<n && j<n; i=i+2, j=j+2){
            int temp = arr[i];  // 1
            arr[i] = arr[j];    // 2
            arr[j] = temp;      // 1
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}