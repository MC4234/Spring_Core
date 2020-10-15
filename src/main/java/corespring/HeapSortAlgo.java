package corespring;

import org.springframework.stereotype.Component;

@Component
public class HeapSortAlgo implements SortAlgo
{
    public int[] sort(int[] arr) 
    {
        //sort the array using heapsort algo
        System.out.println("heapsort");
        return arr;
    }
}