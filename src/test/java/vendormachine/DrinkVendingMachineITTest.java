package vendormachine;

import org.junit.Assert;
import org.junit.Test;
import vendormachine.users.Person;
import vendormachine.users.util.Wallet;
import vendormachine.vendors.DrinkVendingMachine;
import vendormachine.vendors.enums.BRANDS;

public class DrinkVendingMachineITTest {
    @Test
    public void drinkMachineTest(){
        Wallet wallet = new Wallet("Coke",1.5f);
        Person person = new Person("James", wallet);
        DrinkVendingMachine dm = new DrinkVendingMachine();
//        Assert.assertTrue(1.5f,dm.giveCredit(person,person.getWallet()));


    }
}
