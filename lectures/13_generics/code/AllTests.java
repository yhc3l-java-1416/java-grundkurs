import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ GenTest.class, NumericFnsTest.class, GenTwoParamTest.class })
public class AllTests
{

}
