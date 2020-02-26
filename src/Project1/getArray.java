package Project1;

import java.util.*;

public class getArray {
   public static int[] getRandomArray(int n){
       Set<Integer> unique = new HashSet<>();
       int[] arr = new int[n];
       Random random = new Random();
       for(int i = 0; i < n;i++){
            int randomNum = random.nextInt();
            while(unique.contains(randomNum)){
                randomNum = random.nextInt();
            }
            arr[i] = randomNum;
       }
       return arr;
   }

   public static int[] getSortedArray(int n){
       int[] arr = new int[n];
       for(int i = n; i > 0; i--){
           arr[n - i] = i;
       }
       return arr;
   }

}
