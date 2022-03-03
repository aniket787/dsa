// import java.util.*;

// public class Main{
//     public static void main(String[] args)[

//     ]
// }

int i = 0;
int j = 0;

int n = arr.length;

while(i < n){
    if(arr[i] == 0){
        i++;
    }
    else{
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j++;
    }
}

// some similar to quick sort
// TC => time O(N)
//  space => )(1)
