import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MinMaxArrElementTest {
    public Integer[] MinMaxArrElement(Integer[] arr){
        Integer min = 999999999;
        Integer max = -999999999;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max = arr[i];
            if(arr[i]<min) min = arr[i];
        }
        return new Integer[] {max, min};
    }
    @Test
    public void Test_MinMaxArrElement(){
        for(int counter = 0;counter<100;counter++) {
            Integer[] arr = new Integer[5];
            String arr_string = "[";
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (Integer)(int)(Math.random() * 100);
                if (i == arr.length-1){
                    arr_string += arr[i] + "]";
                    continue;
                }
                arr_string += arr[i] + ", ";
            }
            Integer[] myres = MinMaxArrElement(arr);
            Integer mymax = myres[0];
            Integer mymin = myres[1];
            System.out.println("Array is: "+arr_string+", The Max is: "+mymax+", The Min is: "+mymin);
            System.out.println("Actual max: "+Collections.max(Arrays.asList(arr))+", Actual min: "+Collections.min(Arrays.asList(arr)));
            assertEquals(Collections.max(Arrays.asList(arr)), mymax);
            assertEquals(Collections.min(Arrays.asList(arr)), mymin);
        }
    }
}
