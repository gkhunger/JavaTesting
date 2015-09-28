package travis;
import junit.framework.TestCase;

public class BasicTest extends TestCase {
  Travis travis = new Travis();
  public void testTrue() {
    assertTrue(true);
  }
 
  public void testSum(){
    assertTrue(travis.sum(1,2) == 3);
  }

  public void testVersion(){
    assertTrue(travis.getTypeOfDayWithSwitchStatement("Sunday").equals("Weekend"));
  }
}
