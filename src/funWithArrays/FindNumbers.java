package funWithArrays;

public class FindNumbers {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            String s = nums[i] + "";
            if (s.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findNumbers2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digital = 0;
            while (nums[i] != 0) {
                nums[i] = nums[i] / 10;
                digital++;
            }
            if (digital % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public static int findNumbers3(int[] nums) {
        int ans = 0;
        for(int num: nums){
            if( ((int)Math.log10(num) -1)  % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] a1 = {12, 345, 2, 6, 7896};
//        System.out.println(findNumbers(a1));
//        System.out.println(findNumbers2(a1));
        System.out.println(findNumbers3(a1));

    }
}
