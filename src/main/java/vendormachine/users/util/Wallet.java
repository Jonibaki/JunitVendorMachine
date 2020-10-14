package vendormachine.users.util;

import java.util.ArrayList;
import java.util.List;

public class Wallet {

    private String brand = "Generic";
    private float storedCredit = 0.5f; // using f after a decimal value treats it the as a float(rather than a double)
//    public List<Float> storesCreditList = new ArrayList<Float>();
    public Wallet(){}

    public Wallet(float startCredit){
        this.brand = "Generic";
        this.storedCredit = startCredit; // using f after a decimal value treats it the as a float(rather than a double)
    }

    public Wallet(String brandName, float startCredit){
        this.brand = brandName;
        this.storedCredit = startCredit; // using f after a decimal value treats it the as a float(rather than a double)
    }

	//==================
	//===	Methods
	//==================

    public void addCredit(float credit){
        this.storedCredit += credit;
    }
    
    public float getCredit(float retrieve) {
        if(retrieve > this.storedCredit){
            //TODO replace 'Sys.out's with Log4j
            System.out.println("Warning: request exceeds value in wallet!");
            System.out.println("Request: " + retrieve + ",\tstored value: " + retrieve);

            return 0;
        }else {
        	this.storedCredit -= retrieve;
        	
            return retrieve;
        }
    }
    
    //===============================
    //===  'get'ors
    //===============================

    public float getAllCredit(){
        return this.storedCredit;
    }
//    public List<Float> getAllCredits(){
//        return this.storesCreditList;
//    }

    public String getBrand() {
        return this.brand;
    }

    //===============================
    //===  'set'ors
    //===============================
    public void setCredit(float credit){
        this.storedCredit = credit;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
}
