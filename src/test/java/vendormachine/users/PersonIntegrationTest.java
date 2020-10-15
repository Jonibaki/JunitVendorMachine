package vendormachine.users;

import org.junit.Assert;
import org.junit.Test;
import vendormachine.users.util.Wallet;

public class PersonIntegrationTest {
    @Test
    public void addCreditIntegratedTest(){
        Wallet wallet = new Wallet("Generic", 2.0f);
        Person person = new Person("James",wallet);
        Assert.assertEquals(2.0f, person.getWallet().getAllCredit(),0.1f);
        Assert.assertEquals("Generic", person.getWallet().getBrand());
        Assert.assertEquals("James", person.getName());
    }
}
