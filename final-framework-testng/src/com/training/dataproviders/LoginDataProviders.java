package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(LoginBean temp : list){
			Object[]  obj = new Object[4]; 
			obj[0] = temp.getMember_Login(); 
			obj[1] = temp.getTitle_textbox();
			obj[2] = temp.getPrice(); 
			obj[3] = temp.getDescription();
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData(){
		String fileName ="C:/Users/Naveen/Desktop/Testing.xlsx"; 
		return new ApachePOIExcelRead().getExcelContent(fileName); 
	}

	@DataProvider(name="cyclos1")
	public Object[][]getExcelcontact(){
		String FileName="C:\\Users\\IBM\\Desktop\\Project Test Cases\\Complex\\Book1.xlsx";
		return new ApachePOIExcelRead().getExcelContent(FileName);
	}
	
	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData(){
		// ensure you will have the title as first line in the file 
		return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls", "Sheet1"); 
	}
}