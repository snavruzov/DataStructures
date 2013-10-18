package sort;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * User: Sardor Navruzov
 * Date: 10/18/13
 * Time: 3:53 PM
 */
public class MergeSort implements SortAlgorithm
{
    private Integer[] arr;

    public MergeSort()
    {

    }

    public MergeSort(Integer[] arr)
    {
        this.arr = arr;
    }

    @Override
    public void sort()
    {
        arr = sorting(arr);
    }

    private Integer[] sorting(Integer[] data)
    {
        Integer size = data.length;
        if (size <= 1)
        {
            return data;
        }
        else
        {
            Integer[] sorted = new Integer[size];
            Integer middle = size / 2;
            Integer rem = size - middle;
            Integer[] L = new Integer[middle];
            Integer[] R = new Integer[rem];
            System.arraycopy(data, 0, L, 0, middle);
            System.arraycopy(data, middle, R, 0, rem);
            L = this.sorting(L);
            R = this.sorting(R);
            sorted = merging(L, R);
            return sorted;
        }
    }

    private Integer[] merging(Integer[] L, Integer[] R)
    {
        Integer sizeL = L.length;
        Integer sizeR = R.length;
        Integer[] merged = new Integer[sizeL + sizeR];
        Integer i = 0;
        Integer j = 0;
        while (i < sizeL || j < sizeR)
        {
            if (i < sizeL & j < sizeR)
            {
                if (L[i] <= R[j])
                {
                    merged[i + j] = L[i];
                    i++;
                }
                else
                {
                    merged[i + j] = R[j];
                    j++;
                }
            }
            else if (i < sizeL)
            {
                merged[i + j] = L[i];
                i++;
            }
            else if (j < sizeR)
            {
                merged[i + j] = R[j];
                j++;
            }
        }
        return merged;
    }

    @Override
    public String toString()
    {
        return "MergeSort{" + "arr=" + (arr == null ? null : Arrays.asList(arr)) + '}';
    }
}
