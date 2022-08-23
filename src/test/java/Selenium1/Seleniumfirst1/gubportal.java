package Selenium1.Seleniumfirst1;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class gubportal extends BaseDriver {
	public static String baseUrl="https://studentportal.green.edu.bd/Account/login?ReturnUrl=%2F";
	@Test(priority=0)
	public void openUrl() throws InterruptedException {
		Driver.get(baseUrl);
		Driver.manage().window().maximize();	
		Thread.sleep(2000);
	}
	@Test(priority=1)
	public void Test1() throws InterruptedException {
		Driver.findElement(By.id("Input_LoginId")).sendKeys("183002012");
		Thread.sleep(2000);
		Driver.findElement(By.id("Input_Password")).sendKeys("524864");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/button")).click();
	}
	@Test(priority=2)
	public void Test2() throws InterruptedException {
		Thread.sleep(2000);
		Driver.get("https://studentportal.green.edu.bd/Account/login?ReturnUrl=%2F");
		Thread.sleep(2000);
		Driver.findElement(By.id("Input_LoginId")).sendKeys("183002013");
		Thread.sleep(2000);
		Driver.findElement(By.id("Input_Password")).sendKeys("524862");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id=\"account\"]/div[4]/button")).click();
	}
	@Test(priority=3)
	public void Test3() throws InterruptedException {
		 Thread.sleep(2000);
		 Driver.get("https://studentportal.green.edu.bd/Student/StudentCourseHistory");
		 Thread.sleep(2000);
		 Driver.findElement(By.id("srcInput")).sendKeys("Computer Architecture");
		 Thread.sleep(2000);
	}
	@Test(priority=4)
	public void Test4() throws InterruptedException {
		 Driver.get("https://studentportal.green.edu.bd/Student/StudentBillHistory");
		 Thread.sleep(2000);
		 Driver.findElement(By.id("srcInput")).sendKeys("IT & Library Services Fees");
		 Thread.sleep(2000);
	}
	@Test(priority=5)
	public void Test5() throws InterruptedException {
		 Driver.get("https://studentportal.green.edu.bd/Registration/Evaluation");
		 Thread.sleep(2000);
		 Driver.findElement(By.xpath("/html/body/div/main/div[2]/div/section/div[3]/div/div/div/div/div/div[1]/div[2]/select")).click();
		 Thread.sleep(2000);
		 Driver.findElement(By.id("grade")).sendKeys("B");
		 Thread.sleep(2000);
	}
	@Test(priority=6)
	public void Test6() throws InterruptedException {
	   	 Driver.get("https://studentportal.green.edu.bd/Registration/PreAdvising");
		 Thread.sleep(2000);
    }
	@Test(priority=7)
	public void Test7() throws InterruptedException {
		  Driver.get("https://studentportal.green.edu.bd/Registration/Preadvising_Retake");
	 	  Thread.sleep(2000);
    }
	@Test(priority=8)
	public void Test8() throws InterruptedException {
		   Driver.get(" https://studentportal.green.edu.bd/Student/StudentProfile");
		   Thread.sleep(2000);
    }
	@Test(priority=9)
	public void Test9() throws InterruptedException {
		Driver.get("https://studentportal.green.edu.bd/Student/StudentClassRoutine");
	    Thread.sleep(2000);
    }
	@Test(priority=10)
	public void Test10() throws InterruptedException {
		   Driver.get("https://studentportal.green.edu.bd/Student/StudentLedger");
		   Thread.sleep(2000);
    }
	@Test(priority=11)
	public void Test11() throws InterruptedException {
		 Driver.get("https://studentportal.green.edu.bd/Student/StudentAdmitCard");
		  Thread.sleep(2000);
		  Driver.findElement(By.xpath("//*[@id=\"StudentAdmitCardController\"]/div[3]/div/div[2]/div/div/div[1]/select")).sendKeys("Final");
		  Thread.sleep(2000);
		  Driver.findElement(By.xpath("//*[@id=\"StudentAdmitCardController\"]/div[3]/div/div[2]/div/div/div[2]/button")).click();
		  Thread.sleep(2000);
    }
	@Test(priority=12)
	public void Test12() throws InterruptedException {
		Driver.get("https://studentportal.green.edu.bd/Account/ChangePasswordV2");
		 Thread.sleep(2000);
		 Driver.findElement(By.id("P_Password")).sendKeys("183002012");
		 Thread.sleep(2000);
		Driver.findElement(By.id("New_psw")).sendKeys("183002012");
		 Thread.sleep(2000);
		 Driver.findElement(By.id("Con_psw")).sendKeys("524864");
		Thread.sleep(2000);
  }
	@Test(priority=13)
	public void Test13() throws InterruptedException {
		Driver.get(" https://studentportal.green.edu.bd/Student/StudentProgramChange");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id=\"ddlNewProgram\"]")).sendKeys("English");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id=\"txtRemarks\"]")).sendKeys("For sick");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id=\"ApplicationForm\"]/div/div[4]/div[2]/button")).click();
		Thread.sleep(2000);
  }
	@Test(priority=14)
	public void Test14() throws InterruptedException {
		Driver.get(" https://studentportal.green.edu.bd/Student/StudentOthersExamApply");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id=\"StudentOthersExamApplyController\"]/div[3]/div/div[2]/div/div/div[1]/select")).sendKeys("Mid Term Overlap, Improvement, Make-Up");
		Thread.sleep(2000);
		Driver.findElement(By.xpath("//*[@id=\"StudentOthersExamApplyController\"]/div[3]/div/div[2]/div/div/div[2]/button")).click();
		Thread.sleep(2000);
		Driver.get(" https://studentportal.green.edu.bd/Student/StudentOthersExamApply");
		Thread.sleep(2000);
  }
	@Test(priority=15)
	public void Test15() throws InterruptedException {
		 Thread.sleep(2000);
		 Driver.findElement(By.xpath("/html/body/header/nav/div/div/div[2]/div/ul/li[3]/a")).click(); 
	}
	
}

