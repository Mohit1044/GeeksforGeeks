class Solution
{
    public int firstElementKTime(int[] a, int n, int k) { 
        // check given in constrians --> 1<= A[i] <= 200
        // taking a frequrncy unordered map
        int [] fmap = new int [200];
        // traversal on given array
        for(int i = 0; i < n; i ++) {
            int j = a[i];
            // increase the map frequency
            fmap[j] ++;
            /// checking given condition
            if(fmap[j] == k) {
                // return array occurance who equal k given value
                return a[i];
            }
        }
        return -1;
    } 
}
