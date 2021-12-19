package ExperimentNine;

/**
 * @author SHW
 * @date 2021/12/18 20:36
 */
public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        System.out.println("正在调用适配者 BinarySearch 的 binarySearch方法！");
        return search(arr, target);
    }

    public static int search(int[] arr, int target) {
        if (target < arr[0] || target > arr[arr.length-1]) {
            return -1;
        }
        int l = 0, r = arr.length-1;
        while (l <= r) {
            int mid = (r+l)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                r = mid-1;
            } else {
                l = mid+1;
            }
        }
        return -1;
    }
}
