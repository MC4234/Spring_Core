package corespring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.*;

//class will help us search an element in the array which it will sort first
//singleton scope
@Component
//@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    
    /*
     * public BinarySearchImpl(BubbleSortAlgo bubbleSortAlgo) { // TODO
     * Auto-generated constructor stub }
     */
    
    @Autowired
    SortAlgo sortAlgo;
    
    public int binarySearch(int[] arr, int i)
    {
        int[] result = sortAlgo.sort(arr);
        //search the number
        return 1;
    }

    public SortAlgo getSortAlgo() {
        return sortAlgo;
    }
    
    @PostConstruct
    public void afterInit()
    {
        System.out.println("calling init..........");
    }
    
    @PreDestroy
    public void beforeDestroy()
    {
        System.out.println("calling destroy..........");
    }

}

