class Solution{
    public void sortIt(int[] arr){
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        for(int num:arr){
            if(num%2==0)
               even.add(num);
            else odd.add(num);
        }
        Collections.sort(odd,Collections.reverseOrder());
        Collections.sort(even);
        int i=0;
        for(int n:odd)arr[i++]=n;
        for(int n:even)arr[i++]=n;
    }
}
