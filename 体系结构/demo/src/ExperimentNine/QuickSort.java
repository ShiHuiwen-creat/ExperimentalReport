package ExperimentNine;

/**
 * @author SHW
 * @date 2021/12/18 20:35
 */
public class QuickSort {
    public static void quickSort(int[] arr){
        System.out.println("正在调用适配者 QuickSort 的 quickSort方法！");
        solve(arr, 0, arr.length-1);
    }

    public static void solve(int[] arr, int start, int end){
        if(start > end) return;
        else{
            int partition = qs(arr, start, end);
            solve(arr, start, partition-1);
            solve(arr, partition+1, end);
        }
    }

    public static int qs(int[] a, int bg, int ed){
        int base = a[ed];
        while(bg < ed){
            while(bg < ed && a[bg] <= base)
                bg++;
            if(bg < ed){
                int tem = a[bg];
                a[bg] = a[ed];
                a[ed] = tem;
                ed--;
            }
            while(bg < ed && a[ed] >= base) ed--;
            if(bg < ed){
                int tem = a[bg];
                a[bg] = a[ed];
                a[ed] = tem;
                bg++;
            }
        }
        return ed;
    }
}
