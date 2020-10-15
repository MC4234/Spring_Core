package corespring;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode=ScopedProxyMode.TARGET_CLASS)
public class BubbleSortAlgo implements SortAlgo {
    
    public int[] sort(int[] arr) 
    {
        //sort the array using bubblesort algo
        System.out.println("bubblesort");
        return arr;
    }
}