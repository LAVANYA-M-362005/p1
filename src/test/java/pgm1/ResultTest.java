package pgm1;
import org.testng.Assert;
public class ResultTest {
   public void testInvalid() {
	   Assert.assertEquals(Result.display(-4),"invalid");
   }
   public void testPass() {
	   Assert.assertEquals(Result.display(90),"pass");
   }
   public void testFail() {
	   Assert.assertEquals(Result.display(10),"fail");
   }
}
