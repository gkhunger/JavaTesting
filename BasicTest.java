import junit.framework.TestCase;

public class BasicTest extends TestCase {
  public void testTrue() {
    assertTrue(true);
  }
 
  public void testSum(){
    Travis travis = new Travis();
    assertTrue(travis.sum(1,2).equals(3));
}
