package data;

import utilities.Xls_Reader;

public class FacebookLoginData {
	
	Xls_Reader r = new Xls_Reader("C:\\wetransfer-cf27a5\\NikulTest.xlsx");
	
	public String Err_1 = r.getCellData("Data4", 1, 10);//"The password you’ve entered is incorrect. Forgot Password?";
	public String Err_2 = r.getCellData("Data4", 1, 11);//"The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
	public String Err_3 = r.getCellData("Data4", 1, 12);//"The password you’ve entered is incorrect. Forgot Password?";
	public String Err_4 = r.getCellData("Data4", 1, 13);//"The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
	public String Err_5 = r.getCellData("Data4", 1, 14);//"The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
	public String Err_6 = r.getCellData("Data4", 1, 15);//"The email you entered isn’t connected to an account.";
	public String pass = r.getCellData("Data4", 1, 16);//"vbdjcbnsdcnd";
	public String email_1 = r.getCellData("Data4", 1, 17);//"krupa.trivedi01@gmail.com";
	public String InvalidEmail = r.getCellData("Data4", 1, 18);//"krupa.trivedi01@#$$";
	public String num = r.getCellData("Data4", 1, 19);//"5652646262625";
	public String noAccEmail = r.getCellData("Data4", 1, 20);//"makewaytogod@gmail.com";
}
