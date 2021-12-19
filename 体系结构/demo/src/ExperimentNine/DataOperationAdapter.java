package ExperimentNine;

/**
 * @author SHW
 * @date 2021/12/18 20:35
 */
public class DataOperationAdapter implements DataOperation{
    private BinarySearch binarySearch;
    private QuickSort quickSort ;
    @Override
    public void quickSort(int[] arr) {
        quickSort.quickSort(arr);
    }

    @Override
    public int binarySeach(int[] arr, int a) {

        return binarySearch.binarySearch(arr,a);
    }
}
