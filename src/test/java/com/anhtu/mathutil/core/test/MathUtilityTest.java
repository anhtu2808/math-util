package com.anhtu.mathutil.core.test;

import com.anhtu.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

//  Test case structure: ID, Description, Steps/Procedures ,
//  Exected Value, Status(Pass,Failed), Bug ID (Bugzilla, Jira)]


    //Test case #1:
    @Test
    public void testFactorialGivenRightArgument0ReturnsWell(){
        long expectedValue = 1; // Móng muốn trả về
        long actualValue = MathUtility.getFactorial(0); //Gỉa bộ hàm trả về 10

        //So sánh 2 thằng expected VS actual
        assertEquals(expectedValue,actualValue);
    }

    //Test case #2: check getFactorial() with n = 1
    @Test
    public void testFactorialGivenRightArgument1ReturnsWell(){
        long expectedValue = 1; // Móng muốn trả về
        long actualValue = MathUtility.getFactorial(1); //Gỉa bộ hàm trả về 10

        //So sánh 2 thằng expected VS actual
        assertEquals(expectedValue,actualValue);
    }

    //Test case #3 (gộp): check getFactorial() with n = 2 3 4 5 6.......

    @Test
    public void testFactoriaGivenRightArgumentsReturnsWell(){
        assertEquals(1,MathUtility.getFactorial(0));
        assertEquals(1,MathUtility.getFactorial(1));
        assertEquals(2,MathUtility.getFactorial(2));
        assertEquals(6,MathUtility.getFactorial(3));
        assertEquals(24,MathUtility.getFactorial(4));
        assertEquals(120,MathUtility.getFactorial(5));
    }
    //bad smells = đoạn code bốc muì (Robert C.Martin - Clean code)
    //code bị lặp lại, trộn lộn xộn test data và lệnh kiểm thử
    // ta cần tinh chỉnh, tối ưu code - refactor,

    //Test case #4: check getFactorial() with  n = -1 - 2 -3 -4 -5 21 22 23 24
    @Test
    public void testFactorialGivenWrongArgumentMinus5ThrowException() {
        assertThrows(IllegalArgumentException.class, () -> MathUtility.getFactorial(-5));
    }
}