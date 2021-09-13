package com.runner;

import org.openqa.selenium.WebDriver;

import com.driver.Action;
import com.driver.Get;
import com.driver.Wait;
import com.pages.CreateAccountPage;
import com.pages.MyAccountPage;

public class Base {


	public static WebDriver driver;
	public static Get get = new Get();
	public static Action action = new Action();
	public static Wait wait = new Wait();
	public static CreateAccountPage createAccountPage = new CreateAccountPage();
	public static MyAccountPage myAccountPage = new MyAccountPage();
}
