package sort;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * User: Sardor Navruzov
 * Date: 10/17/13
 * Time: 6:09 PM
 */
public class SelectionSort implements SortAlgorithm
{
    private Integer arr[];

    public SelectionSort()
    {
    }

    public SelectionSort(Integer[] arr)
    {
        this.arr = arr;
    }

    @Override
    public void sort()
    {
        Integer size = arr.length;
        Integer J = 0;
        int tmp = 0;
        for (int I = 0; I < size; I++)
        {
            J = I;
            for (int K = I; K < size; K++)
            {
                if (arr[J] > arr[K])
                {
                    J = K;
                }
            }
            tmp = arr[I];
            arr[I] = arr[I];
            arr[I] = tmp;
        }

    }

    @Override
    public String toString()
    {
        return "SelectionSort{" + "arr=" + (arr == null ? null : Arrays.asList(arr)) + '}';
    }
}
