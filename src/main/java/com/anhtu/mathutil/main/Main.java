
package com.anhtu.mathutil.main;

import com.anhtu.mathutil.core.MathUtility;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenRightArgumentOrReturnWell();
        testFactorialGivenRightArgument5ReturnWell();
    }

    // ta sẽ đi test hàm ta test ra
    // ta cân test hàm  getFactorial() với các bộ data đưa vào -> những test case
    // test case là gì ? Là những bộ data ta đưa và và kì vvọng app chạy đúng


    //TEST CASE #1:
    //DESCRIPTION: ( Mô tả mục đích test case test điều gì  ?
    //              TO CHECK, TO VERIFED the getFactorial() method with correct given argument, e.g n = 0)
    //              vietsub: kiểm tra hàm giai thừa có
    //Các bước test hàm (Step/Procedures): Nhấn gì nhập gì,... ?

    //bước 1.  Call getFactorial with valid arg: getFactorial(0)
    //expected result: hy vọng hàm trả về gì với n = 1
    //-> to have number 1 as the result of 0!

    //status (trạng thái của test case là gì sau khi chạy app chạy màn hình)
    //        PASSED, FAILED (BUG)

    //viet code để test hàm chính getFactorial() chạy đúng với n = 0

    static void testFactorialGivenRightArgumentOrReturnWell() {
        int n = 0;            // dự tính tính 0!
        long expectedResult = 1;
        long actualResult = MathUtility.getFactorial(0); // tính thử 0! bằng hàm

        //so sánh:
        System.out.println(n + "! = \n"
                             + "expected value: " + expectedResult + "\n"
                             + "actual value: " + actualResult);
    }


    //TESTCASE #2:
    //Description: to check, to verify the getFactorial() method
    //bước 1.  Call getFactorial with valid arg: getFactorial(5)
    //expected result: hy vọng hàm trả về gì với n =
    //-> to have number 1 as the result of 0!

    //status (trạng thái của test case là gì sau khi chạy app chạy màn hình)
    //        PASSED, FAILED (BUG)

    //viet code để test hàm chính getFactorial() chạy đúng với n = 0


    static void testFactorialGivenRightArgument5ReturnWell() {
        int n = 5;            // dự tính tính 5!
        long expectedResult = 120;
        long actualResult = MathUtility.getFactorial(5); // tính thử 5! bằng hàm

        //so sánh:
        System.out.println(n + "! = \n"
                + "expected value: " + expectedResult + "\n"
                + "actual value: " + actualResult);
    }
}