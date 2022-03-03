


// Only binary digits are given 
// basically we have to identify 1's and move them to end of array

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



