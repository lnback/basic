public class NumberCalc{
    public static void main(String[] args){
        int nums[] ={1, -2, 3, 5, -1};
        int sum = 0,max = nums[0];
        for(int num : nums){
            if(sum > 0){
                sum += num;
            }else {
                sum = num;
            }
            max = sum > max ? sum : max;
        }
        System.out.println(max);
    }
}