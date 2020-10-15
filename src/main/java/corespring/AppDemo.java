package corespring;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//1. What are the beans?
//2. What are the dependencies of the beans?
//3. Where to search the beans?

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppDemo
{
    private static Logger LOGGER = LoggerFactory.getLogger(AppDemo.class);
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BinarySearchImpl bSearchImpl = ctx.getBean(BinarySearchImpl.class);
        BinarySearchImpl bSearchImpl1 = ctx.getBean(BinarySearchImpl.class);
        LOGGER.info("search1 -> {}, search2-> {}", bSearchImpl,bSearchImpl1);
        LOGGER.info("sort1 ->{}, sort2 -> {}", bSearchImpl.getSortAlgo(),bSearchImpl1.getSortAlgo());
        
               
        /*
         * AnnotationConfigApplicationContext ctx1 = new
         * AnnotationConfigApplicationContext(SpringConfig.class); BinarySearchImpl
         * bSearchImpl1Frmctx1 = ctx1.getBean(BinarySearchImpl.class); BinarySearchImpl
         * bSearchImpl2Frmctx2 = ctx1.getBean(BinarySearchImpl.class);
         * 
         * LOGGER.info("search1fromctx1 -> {}, search2fromctx2-> {}",
         * bSearchImpl1Frmctx1,bSearchImpl2Frmctx2);
         */
        int[] arr = {2,33,4, 8, 90, 22};
        int result = bSearchImpl.binarySearch(arr,8);
        System.out.println("Result is:" + result);
        ctx.close();
    }
}