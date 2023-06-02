package TestCases;

import Heplers.JsonReader;
import Pages.LoginPage;
import com.google.gson.JsonObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChangePassword extends Baseclass {


    @BeforeClass
    public void init() {
        JsonReader jsonReader = new JsonReader();


    }

    @BeforeClass
    public void login() {
        //open application URL
        webDriver.get(System.getProperty("target.homepage"));
        // initialize an object from login page


    }

    @Test(priority = 1)
    public void ChangePassword() throws InterruptedException {

        System.out.println("Page Loaded  successfully");

    }




}
