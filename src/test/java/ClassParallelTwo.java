import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by AL on 09/02/2018.
 */
public class ClassParallelTwo {


    @BeforeClass
    public void beforeClass() {
        long id = Thread.currentThread().getId();
        System.out.println("B Before test-class. Thread id is: " + id);
    }

    @Test
    public void testMethodOne() {
        long id = Thread.currentThread().getId();
        System.out.println("B Sample test-method One. Thread id is: " + id);
    }

    @Test
    public void testMethodTwo() {
        long id = Thread.currentThread().getId();
        System.out.println("B Sample test-method Two. Thread id is: " + id);
    }

    @AfterClass
    public void afterClass() {
        long id = Thread.currentThread().getId();
        System.out.println("B After test-class. Thread id is: " + id);
    }

}
