import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class EvenOddTest {
    public String EvenOdd(int number){
        if(number % 2 == 0 )return "EVEN";
        else return "ODD";
    }
    @Test
    public void Test_EvenOdd(){
        for(int i=0;i<=100;i++){
            String result = EvenOdd(i);
            System.out.println("Number is: "+ i +", The Result is: "+result);
            assertEquals("EVEN", result);
        }
        for(int i=1;i<=100;i+=2){
            String result = EvenOdd(i);
            System.out.println("Number is: "+ i +", The Result is: "+result);
            assertEquals("ODD", result);
        }
    }
}
