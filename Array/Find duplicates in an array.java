class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer>newlist = new ArrayList<>();
        Arrays.sort(arr);
        int count = 0;
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]==arr[i+1]&&count!=1)
            {
                newlist.add(arr[i]);
                count++;
            }
            else if(arr[i]!=arr[i+1]){
                count = 0;
            }
           
        }
         if(newlist.size()==0)
            {
                newlist.add(-1);
            }
            return newlist;
    }
}
