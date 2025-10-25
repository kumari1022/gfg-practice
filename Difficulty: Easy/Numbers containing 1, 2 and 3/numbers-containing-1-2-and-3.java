class Solution {
    public List<Integer> filterByDigits(int[] arr)
    {
        List<Integer> result=new ArrayList<>();

        for (int num:arr) 
        {
            if (isValid(num)) 
            {
                result.add(num);
            }
        }

        if (result.isEmpty())
        {
            result.add(-1);
        }

        return result;
    }
    private boolean isValid(int num) 
    {
        while (num > 0)
        {
            int digit=num%10;
            if (digit!=1&&digit!=2&&digit!=3) 
            {
                return false;
            }
            num/=10;
        }
        return true;
    }
}
