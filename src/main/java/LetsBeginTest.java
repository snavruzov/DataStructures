import sort.*;

/**
 * Created by Intellij IDEA.
 * User: Sardor Navruzov
 * Date: 10/17/13
 * Time: 12:02 PM
 */
public class LetsBeginTest
{
    private LetsBeginTest()
    {
    }

    public static void main(String[] args)
    {
        Integer[] arr = {1,4,7,3,5,64,2,46,12,44,9,8,0};

        SortAlgorithm selection = new SelectionSort(arr);
        selection.sort();

        SortAlgorithm bubble = new BubbleSort(arr);
        bubble.sort();

        SortAlgorithm quick = new QuickSort(arr);
        quick.sort();

        SortAlgorithm insert = new InsertionSort(arr);
        insert.sort();

        SortAlgorithm merge = new MergeSort(arr);
        merge.sort();

        System.out.println(merge);


    }

}
