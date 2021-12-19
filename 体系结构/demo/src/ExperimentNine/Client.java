package ExperimentNine;

/**
 * @author SHW
 * @date 2021/12/18 20:42
 */
public class Client {
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,1,2};
        DataOperation dataOperation = new DataOperationAdapter();
        dataOperation.quickSort(arr);
        for(int num:arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("所找的数为第几个：");
        System.out.println(dataOperation.binarySeach(arr,5)+1);

    }

}
