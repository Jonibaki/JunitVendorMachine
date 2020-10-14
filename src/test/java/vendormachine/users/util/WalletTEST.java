package vendormachine.users.util;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WalletTEST {
    private static Wallet wallet = new Wallet();
    private static String band = "my lovely band";
    private static float storeCredit =1.0f;
    private static float storeCreditTwo = 2.5f;

//    @BeforeClass
//    public static void setup(){
//        this.band = "Generic";
//        this.storeCredit =1.0f;
//        this.storeCreditTwo = 2.5f;
//    }
    @Test
    public void getCreditTest(){
        Wallet wallet = new Wallet(storeCredit);
        float actual = wallet.getAllCredit();
        assertEquals(storeCredit,actual, 0.1f);

    }
    @Test
    public void addCreditTest(){
        Wallet wallet = new Wallet();
        wallet.addCredit(storeCredit);
        assertEquals(storeCredit,wallet.getCredit(storeCredit),0.1f);

    }
//    @Test
//    public void getAllCreditsTest(){
//        List<Float> listWallet = new ArrayList<Float>();
////        Wallet newWallet = new Wallet(storeCredit);
////        Wallet anotherWallet = new Wallet(storeCreditTwo);
////        listWallet.add(newWallet.getCredit(storeCredit));
////        listWallet.add(anotherWallet.getCredit(storeCreditTwo));
//
//        listWallet.add(new Wallet().getCredit(storeCredit));
//        listWallet.add(new Wallet().getCredit(storeCreditTwo));
//        assertEquals(new Wallet().storesCreditList,listWallet);
//
//
//
//    }
    @Test
    public void getAllCreditTest(){
        Wallet wallet = new Wallet();
        wallet.setCredit(storeCredit);
        assertEquals(storeCredit, wallet.getAllCredit(),0.1f);

    }
    @Test
    public void setCreditTest(){
        Wallet wallet = new Wallet();
        wallet.setCredit(storeCreditTwo);
        assertEquals(storeCreditTwo,wallet.getCredit(storeCreditTwo),0.1f);

    }
    @Test
    public void setBrandTest(){
        Wallet wallet = new Wallet(band, storeCredit);
        String actual = wallet.getBrand();
        assertEquals(band, actual);

    }
    @Test
    public void getBrandTest(){
        Wallet wallet = new Wallet();
        wallet.setBrand(band);
        assertEquals(band, wallet.getBrand());

    }
    @AfterClass
    public static void afterMath(){

    }

}
