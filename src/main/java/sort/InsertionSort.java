package sort;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * User: Sardor Navruzov
 * Date: 10/18/13
 * Time: 3:38 PM
 */
public class InsertionSort implements SortAlgorithm
{
    private Integer[] arr;

    public InsertionSort()
    {
    }

    public InsertionSort(Integer[] arr)
    {
        this.arr = arr;
    }

    @Override
    public void sort()
    {
        Integer size = arr.length;
        Integer key = 0;
        Integer I = 0;
        for (int J = 1; J < size; J++)
        {
            key = arr[J];
            I = J - 1;
            while (I >= 0 && arr[I] > key)
            {
                arr[I + 1] = arr[I];
                I = I - 1;
                arr[I + 1] = key;
            }
        }
    }

    @Override
    public String toString()
    {
        return "InsertionSort{" + "arr=" + (arr == null ? null : Arrays.asList(arr)) + '}';
    }
}
