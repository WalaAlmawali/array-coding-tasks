
public class examples {


    public static void main(String[] args) {
      // task 1
        /*int[] nums = {1, 2, 3, 7};
       System.out.println(firstLast6(nums));*/

        // task 2
       /* int[] arr1 = {1, 2, 3, 7};
        int[] arr2 = {1,3};
        examples ex = new examples();
        System.out.println(ex.commonEnd(arr1,arr2));*/

        //task 3
        int[] arr = {1, 2, 3};
        examples ex3= new examples();
        ex3.reverse3(arr);

    }

    public static boolean firstLast6(int[] nums) {

        if ((nums[0] == 6) || nums[nums.length - 1] == 6) {
            return true;
        }
            return false;

    }
    public  boolean commonEnd(int []arr1,int []arr2){
        if((arr1[0] == arr2[0]) || (arr1[arr1.length -1] == arr2[arr2.length -1])){
            return true;
        }
        return false;
    }

    public void reverse3(int [] arr ){
       int [] newArray = {arr[2],arr[1],arr[0]};
       System.out.println(java.util.Arrays.toString(newArray));

    }
}






