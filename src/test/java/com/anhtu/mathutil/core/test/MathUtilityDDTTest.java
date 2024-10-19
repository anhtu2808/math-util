package com.anhtu.mathutil.core.test;

import com.anhtu.mathutil.core.MathUtility;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //Class này sẽ chưa các hàm kiểm thử code theo style DDT
    //Data Driven Testing, ta tách code kiểm thử (Các lệnh Assert()) riêng không gộp chung với bộ data kiểm thử
    //Mục tiêu: dễ đọc code kiểm thử, dễ đánh giá và xem có bao nhiêu test case đang đc test, đã đủ hay chưa, vì nó rất dễ thấy do data nằm riêng
    //-> giúp nguyên lí pesticide paradox

    //Bộ data đưa vào test sẽ để riêng ở 1 hàm public static
    // Hàm này trả về mảng các con số < 0 hoặc > 20 , đó là nhungex n gây ra exception khi ta xài hàm getF(). Ta test xem hàm có ném ngoại lệ với data cà chớn hay không
    public static Integer[] initWrongDataSet() {
        return new Integer[]{-1, -2, -3, -100, -1000, 21, 22, 33, 100, 1000};
    }

    //Test case #..: check If getFatactorial() throws IllegalArgumentException
    //                         in case of n < 0 or n > 20
    @ParameterizedTest
    @MethodSource("initWrongDataSet")
    public void testFactorialGivenWrongArgumentsThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(n);
        });
    }
    //Test case#...: check getFactorial() with arguments and runs well
    //                                     n= 0 1 2 3 4 .. 18 19 20
    public static Object[][] initRightDataSet(){
        return new Object[][]{{0,1},
                              {1,1},
                              {3,6},
                              {4,24},
                              {5,120},
                              {6,720},
        };
    }
    @ParameterizedTest
    @MethodSource("initRightDataSet")
    public void testFactorialGivenRightArgumentsRunWell(int n , long expected){
            assertEquals(expected, MathUtility.getFactorial(n));
    }
}