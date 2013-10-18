package sort;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * User: Sardor Navruzov
 * Date: 10/18/13
 * Time: 2:35 PM
 */
public class QuickSort implements SortAlgorithm
{
    private Integer[] arr;

    public QuickSort()
    {
    }

    public QuickSort(Integer[] arr)
    {
        this.arr = arr;
    }

    @Override
    public void sort()
    {
        arr = recursiveSorting(arr);
    }

    private Integer[] recursiveSorting(Integer[] arr)
    {
        Integer size = arr.length;
        Integer pivot = 0;
        Integer idx = size / 2;
        Integer I, J = 0, K = 0;

        if (size < 2)
        {
            return arr;
        }
        else
        {
            Integer[] L = new Integer[size];
            Integer[] R = new Integer[size];
            Integer[] sorted = new Integer[size];
            pivot = arr[idx];

            for (I = 0; I < size; I++)
            {
                if (!I.equals(idx))
                {
                    if (arr[I] < pivot)
                    {
                        L[J] = arr[I];
                        J++;
                    }
                    else
                    {
                        R[K] = arr[I];
                        K++;
                    }
                }

            }
            Integer[] sortedL = new Integer[J];
            Integer[] sortedR = new Integer[K];
            System.arraycopy(L, 0, sortedL, 0, J);
            System.arraycopy(R, 0, sortedR, 0, K);
            sortedL = recursiveSorting(sortedL);
            sortedR = recursiveSorting(sortedR);

            System.arraycopy(sortedL, 0, sorted, 0, J);
            sorted[J] = pivot;
            System.arraycopy(sortedR, 0, sorted, J + 1, K);

            return sorted;
        }
    }

    @Override
    public String toString()
    {
        return "QuickSort{" + "arr=" + (arr == null ? null : Arrays.asList(arr)) + '}';
    }
}
