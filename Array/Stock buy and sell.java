class Solution{
    //Function to find the days of buying and selling stock for max profit.
    ArrayList<ArrayList<Integer>> stockBuySell(int [] a,int n) 
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        for(int i=1;i<n;i++)
        {
            if(a[i-1]<a[i])
            {
                list.add(new ArrayList<Integer>(Arrays.asList(i-1,i)));
            }
        }
        return list;
    }
}
