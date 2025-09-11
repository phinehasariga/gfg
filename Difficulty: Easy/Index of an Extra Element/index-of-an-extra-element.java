/*Complete the function below*/
class Solution {
    public int findExtra(int a[], int b[]) {
        // add code here.
        
        for(int i=0;i<b.length;i++){
            
                if(a[i] != b[i]){
                    return i;
                }
            
        }
        return a.length-1;
    }
}