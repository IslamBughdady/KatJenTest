
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.RectangleSize


 /**
	 * Create Header basic authentication property,
	 * this property value is Base64 encoded token from user name and password 
	 * @param usernameAdmin user name
	 * @param password password password
	 * @return Katalon object property, an instance of TestObjectProperty 
	 */ 
def static "com.example.WebApiCustomKeywords.createBasicAuthProperty"(
    	String usernameAdmin	
     , 	String password	) {
    (new com.example.WebApiCustomKeywords()).createBasicAuthProperty(
        	usernameAdmin
         , 	password)
}

 /**
	 * Create HTTP body content in json format to update existing user
	 * @param password Account password
	 * @param emailAddress
	 * @param displayName A friendly user name
	 * @param notification Any comment
	 * @return Json string generated from inputed data
	 */ 
def static "com.example.WebApiCustomKeywords.updateHttpBody"(
    	String password	
     , 	String emailAddress	
     , 	String displayName	
     , 	String notification	) {
    (new com.example.WebApiCustomKeywords()).updateHttpBody(
        	password
         , 	emailAddress
         , 	displayName
         , 	notification)
}

 /**
	 * Create HTTP body content in json format to create new user 
	 * @param username Account name
	 * @param password Account password
	 * @param emailAddress 
	 * @param displayName A friendly user name
	 * @param notification Any comment
	 * @return Json string generated from inputed data
	 */ 
def static "com.example.WebApiCustomKeywords.newHttpBody"(
    	String username	
     , 	String password	
     , 	String emailAddress	
     , 	String displayName	
     , 	String notification	) {
    (new com.example.WebApiCustomKeywords()).newHttpBody(
        	username
         , 	password
         , 	emailAddress
         , 	displayName
         , 	notification)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}
