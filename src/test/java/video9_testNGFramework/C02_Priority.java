package video9_testNGFramework;

import org.testng.annotations.Test;

public class C02_Priority {

    @Test(priority = 0)
    public void test01() {
        System.out.println("Test 01");
    }

    @Test(priority = 0)
    public void test02() {
        System.out.println("Test 02");
    }

    //priority verilmedikçe 0 sayılır, aynı olursa isme göre çalışır.
    @Test
    public void test03() {
        System.out.println("Test 03");
    }
}
