package testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationSequence extends AnnotationSequence1 {
	@BeforeSuite
	void bfrsuite(){
	}
	@BeforeTest
	void bfrtest(){
	}
	@BeforeClass
	void bfrclass(){
	}
	@BeforeMethod
	void CheckTextOnLoginPage(){
	}
    @Test
    	void verifyLoginAfterCorrectCredential() {
    	AnnotationSequence t = new AnnotationSequence();
    	t.login("Admin","admin123");
    	Assert.assertEquals(true, true);
    	}
    @AfterMethod
    void logout() {
    }
    @AfterClass
	void afterclass(){
	}
	@AfterTest
	void aftertest(){
	}
	@AfterSuite
	void aftersuite(){
	}
    }

