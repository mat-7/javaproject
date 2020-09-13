/** 快速排序
 * @author xwfjava
 * @create 2020-09-13 16:48
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9,0,4,-2,5,7,8,10,-4,13,15,9};
        int[] sortArray = Quicksort(array, 0, array.length-1);
        for (int num : sortArray)
            System.out.print(num + " ");
    }

    public static int[] Quicksort(int[] array, int start, int end){
        if (array.length < 1 || start < 0 || end >= array.length || start > end) return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            Quicksort(array, start, smallIndex-1);
        if (smallIndex < end)
            Quicksort(array, smallIndex+1, end);
        return array;
    }

    // 分治partition
    public static int partition(int[] array, int start, int end){
        int pivot = (int) (start + Math.random()*(end - start + 1));//基准
        int smallIndex = start - 1;
        swap(array, pivot, end);//将基准移到end处
        for (int i = start; i <= end; i++) {
            if (array[i] <= array[end]){
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        }
        // 实现了array[start, smallIndex] <= array[smallIndex+1, end]
        return smallIndex;
    }

    // 交换数组内两个元素
    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
