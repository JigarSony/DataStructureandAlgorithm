package TimeCompexity;

import java.util.HashMap;
import java.util.Map;

public class TCBigO {

    public static void main(String[] args) {

        int n = 1; //O(1)
        System.out.println(n);

        int num = 21; // O(1)
        if (num%2==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

        //hashmap and fetch the from map: lookup hashmap -- O(1)
        Map<String,Integer> studentMarks = new HashMap<String,Integer>();
        studentMarks.put("Tom",100);
        studentMarks.put("Alice",200);
        studentMarks.put("Jerry",250);

        System.out.println(studentMarks.get("Jerry"));

        //O(n)
        int n1 = 10;
        for (int i = 1;i<=n1;i++){
            System.out.println(i);
        }


        //WAP to find max# of unsorted array
        int arr[] = {2,54,66,100,92};

        int max = 0;
        for (int i=0;i<arr.length;i++){ //n
            if (max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println(max);


        //O(n^2)

        for(int m=0; m<=3; m++){
            for (int p=0;p<=3;p++){
                System.out.print(m+""+p+ " ");
            }
            System.out.println();
        }

        //wap to find duplicates numbers from array
        int dup[] = {3,44,56,67,3,67};

        for (int i = 0;i<dup.length;i++){ //n^2
            for (int j = 0;j<dup.length;j++){
                if(i==j)
                    continue;
                if (dup[i]==dup[j]){
                    System.out.println(dup[i]+ " is duplicate");
                }
            }
        }

        //O(n^3)
        for (int i = 0;i<dup.length;i++) { //n^2
            for (int j = 0; j < dup.length; j++) {
                for (int k = 0; k < dup.length; k++) {

                }
            }
        }
    }
}
