class Solution{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> result = new ArrayList();
        int max = arr[n-1];
        result.add(max);
        for(int i = n-2 ;i>=0;i--)
        {
            if(max<=arr[i])
            {
                max = arr[i];
                result.add(max);
            }
            
        }
        Collections.reverse(result);
        return result;
    }
}
