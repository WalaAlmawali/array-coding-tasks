
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
       /* int[] arr = {1, 2, 3};
        examples ex3= new examples();
        ex3.reverse3(arr);
*/
        // task 4
        /*int [] arr1 = {1, 2, 3};
        int [] arr2 = {4, 5, 6};
        examples ex4 = new examples();
        ex4.middleWay(arr1,arr2);*/

        // task 5
        int [] arr = {4,2};
        examples ex5 = new examples();
       System.out.println(ex5.no23(arr));


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
    public void middleWay(int []arr1 , int []arr2){
        int [] newArr = {arr1[1],arr2[1]};
        System.out.println(java.util.Arrays.toString(newArr));
    }
    public boolean no23(int [] arr){

        if (arr[0]==2 || arr[1]==2 || arr[0]==3 || arr[1]==3){
            return false;
        }
        return true;
    }

}






