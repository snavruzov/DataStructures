package sort;

import java.util.Arrays;

/**
 * Created by Intellij IDEA.
 * User: Sardor Navruzov
 * Date: 10/17/13
 * Time: 5:17 PM
 */

public class BubbleSort  implements SortAlgorithm
{
    private Integer[] arr;
    public BubbleSort(){}

    public BubbleSort(Integer[] arr){
        this.arr = arr;
    }

    @Override
    public void sort()
    {
        Integer size = arr.length;
        Integer tmp = 0;
        for (int I = 0; I < size; I++)
        {
            for (int J = (size - 1); J >= (I + 1); J--)
            {
                if (arr[J] < arr[J - 1])
                {
                    tmp = arr[J];
                    arr[J] = arr[J - 1];
                    arr[J - 1] = tmp;
                }
            }
        }

    }

    @Override
    public String toString()
    {
        return "BubbleSort{" + "arr=" + (arr == null ? null : Arrays.asList(arr)) + '}';
    }
}
