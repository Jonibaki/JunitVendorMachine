package vendormachine;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import vendormachine.users.Person;
import vendormachine.users.util.Wallet;
import vendormachine.vendors.DefaultSnacks;
import vendormachine.vendors.DrinkVendingMachine;
import vendormachine.vendors.item.Snack;


import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Task 2:
 * 	Objective:
 * 		Test the Wallet class from:
 * 		'vendormachine.vendors.DrinkVendingMachine'
 *
 * 	Goal:
 * 		80% code/line coverage
 * 		TDD: analyse code and add missing methods.
 * */
public class DrinkVendingMachineTEST {
	private static float availableCredit =0;
	private static int selectionId = 0;
	private static ArrayList<Snack> drinkList = new ArrayList<>();
	@BeforeClass
	public static void beforeClass()   {

	}

	@Test
	public void selectDrinkTest() {
		Snack snack = new Snack("Crisp", 1.5f);
		drinkList.add(snack);
		Snack  newSnack = drinkList.get(selectionId);
		assertEquals(snack, newSnack);

	}
	@Test
	public void populateDrinkListTest() {
		Snack[]testSnackList=  {
				new Snack("Water",0.20f),
				new Snack("VanillaBurst", 1.75f),
				new Snack("GoblinSpring",0.90f),
				new Snack("Comet Trails", 2.15f)};
		assertEquals(DefaultSnacks.snackList.length, testSnackList.length);
	}

	@Test
	public void giveCreditTest() {
		final float giveCredit =2.0f;
		Person user = new Person("James", new Wallet(giveCredit));
		assertEquals(2.0f, user.getCredit(giveCredit),0.1f);

	}

	@Test
	public void getAvailableCreditTest() {
	}
	@Test
	public void setAvailableCreditTest() {
	}

	@Test
	public void getDrinkListTest() {

	}
	@Test
	public void setDrinkListTest() {

	}

	@AfterClass
	public static void afterClass()  {

	}

}
