
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import resources.Large_group_MemberHelper;

import com.rational.test.ft.*;
import com.rational.test.ft.object.interfaces.*;
import com.rational.test.ft.object.interfaces.SAP.*;
import com.rational.test.ft.object.interfaces.WPF.*;
import com.rational.test.ft.object.interfaces.dojo.*;
import com.rational.test.ft.object.interfaces.siebel.*;
import com.rational.test.ft.object.interfaces.flex.*;
import com.rational.test.ft.object.interfaces.generichtmlsubdomain.*;
import com.rational.test.ft.script.*;
import com.rational.test.ft.value.*;
import com.rational.test.ft.vp.*;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author AG18664
 */
public class Large_group_Member extends Large_group_MemberHelper
{
	/**
	 * Script Name   : <b>Large_group</b>
	 * Generated     : <b>Feb 28, 2019 5:53:28 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 16299 ()
	 * 
	 * @since  2019/02/28
	 * @author AG18664
	 * @throws IOException 
	 * @throws AWTException 
	 */
	public void testMain(Object[] args) throws IOException, AWTException 
	{
         
                  
		startApp("Extension for Terminal Applications");
		sleep(4);		
		Property[] properties = new Property[2];
		properties[0] = new Property(".class", "com.ibm.terminal.tester.gui.misc.AccessibleTextField");
		properties[1]= new Property(".classIndex", "0");
		
		//TestObject[] text = find(atList(properties));
		
		//TestObject[] text = find(atChild(properties));
		sleep(0.3);
		TestObject[] text = find(atDescendant(properties));
		//		for(int i=0;i<t.length;i++)
//		{
//			Object testObjectClass = t[i].getClass();
//			System.out.println(testObjectClass);
//			
//			
//		}
		//TextGuiSubitemTestObject
//		//((GuiTestObject)t[0]).click();
		TextGuiSubitemTestObject IPaddress = ((TextGuiSubitemTestObject)text[0]);
		IPaddress.waitForExistence();
		IPaddress.setText("30.130.200.57");
		Property b1 = new Property(".class","javax.swing.JButton");
		Property b2 = new Property(".classIndex","4");
		Property[] propertie = {b1,b2};
		//TestObject[] a = find(atChild(propertie));
	    TestObject[] a = find(atDescendant(propertie));
		((GuiTestObject)a[0]).click();
    	sleep(2);
		
		Large_group_Member b = new Large_group_Member();
		String Userid = b.Readfromexcel("Credentials",0,1);
		String password = b.Readfromexcel("Credentials",1,1);
		String Region = b.Readfromexcel("Region", 0, 1);
		
		
		/*606 request */
		
//		
//		b.enter_text(23, 48, "l "+Region);
//		b.enter();
//		b.enter_text(10, 32, Userid);
//		b.enter_text(11, 33, password);
//		b.enter();		
//		ibmExtensionForTerminalBasedAp(ANY,LOADED).inputKeys("{BREAK}");
//		
		/*606 request */
		
		
		/*	EnB team Request */
		
		b.enter_text(23, 48, "ism");//EnB 
		b.enter();
		sleep(1);
		b.enter_text(14, 20, Userid);
		b.enter_text(15, 20, password);
		b.enter();
		sleep(2);
		b.enter_text(23, 15, Region);//EnB
		b.enter();
		ibmExtensionForTerminalBasedAp(ANY,LOADED).inputKeys("{BREAK}");
		ibmExtensionForTerminalBasedAp().inputKeys("/test mfs");//EnB
		b.enter();
		/*	EnB team Request */
		
			
		ibmExtensionForTerminalBasedAp().inputKeys("memb05 ");
		b.enter();
		sleep(2);
		b.enter_text(5, 22, "C1");              
        b.enter();
        sleep(2);

       //File src = new File("C:\\Users\\AG18664\\Desktop\\EnB\\Input file.xlsx");
        
       File src = new File("C:\\Users\\AG18664\\Desktop\\Swetha\\Input file.xlsx");
        
        FileInputStream fis = new FileInputStream(src);
        
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        
        XSSFSheet sheet1 = wb.getSheet("input");

        for(int i=1;i<=sheet1.getLastRowNum();i++)
                
        {
        
        DataFormatter format = new DataFormatter();
        String Case= format.formatCellValue(sheet1.getRow(i).getCell(0));
        String Group= format.formatCellValue(sheet1.getRow(i).getCell(1));
        String Lastname= format.formatCellValue(sheet1.getRow(i).getCell(2));
        String FirstName= format.formatCellValue(sheet1.getRow(i).getCell(3));
        String MID= format.formatCellValue(sheet1.getRow(i).getCell(4));
        String SEX= format.formatCellValue(sheet1.getRow(i).getCell(5));
        String BIRTHDATE= format.formatCellValue(sheet1.getRow(i).getCell(6));
        String Grptype= format.formatCellValue(sheet1.getRow(i).getCell(7));
        String EMAIL= format.formatCellValue(sheet1.getRow(i).getCell(8));
        String Street= format.formatCellValue(sheet1.getRow(i).getCell(9));
        String zip= format.formatCellValue(sheet1.getRow(i).getCell(10));
        String COB= format.formatCellValue(sheet1.getRow(i).getCell(11));
        String EFFdate= format.formatCellValue(sheet1.getRow(i).getCell(12));
        String medA= format.formatCellValue(sheet1.getRow(i).getCell(13));
        //String Case= format.formatCellValue(sheet1.getRow(i).getCell(0));
        
  
        b.enter_text(3, 8, Case);
        b.enter_text(3, 31, Group);
        b.enter_text(5, 22, "NO");
	    b.enter();
	    sleep(1);
	    b.F3();
	    sleep(1);
	    b.enter_text(5, 22, "AD");
	    b.enter();
	    sleep(1);
	    b.enter_text(6, 13, Lastname);
	    //b.enter();
	    b.enter_text(6, 52, FirstName);
	    //b.enter();
	    b.enter_text(6, 71, MID);
	    //b.enter();
	    b.enter_text(7, 6, SEX);
	    //b.enter();
	    b.enter_text(7, 40, BIRTHDATE);
	    //b.enter();
	    b.enter_text(8, 55, Grptype);
	    //b.enter();
	    b.enter_text(9, 38, EMAIL);
	    
	    b.enter_text(10, 13, Street);
	    //b.enter();
	    b.enter_text(10, 49, zip);
	    //b.enter();
	    b.enter_text(19, 6, COB);
	    
	    //Medicare part A
	    
	    b.enter_text(20, 19, medA);
	    b.enter();
//	    
	    
	    //sleep(1);
	    b.enter();
	    
	    
	    
//		String ECERT = (String)field_23_2().getProperty("text");
//		
//		
//		try{
//		if(ECERT.contains("ECERT MUST BE Y/N FOR NV CASE")){
//			b.enter();
//		}
//		}catch(Exception e)
//		{
//			
//		}
	    //ECERT MUST BE Y/N FOR NV CASE
	    //Repeat some steps
	    sleep(3);
	    
	    b.enter_text(6, 13, Lastname);
	    //b.enter();
	    b.enter_text(6, 52, FirstName);
	    //b.enter();
	    b.enter_text(6, 71, MID);
	    //b.enter();
	    b.enter_text(7, 40, BIRTHDATE);
	    //b.enter();
	    b.enter_text(10, 13, Street);
	    //b.enter();
	    b.enter_text(10, 49, zip);
	    //b.enter();
	    sleep(1);
	    b.F6();
	    sleep(1);
	    b.F9();
	    sleep(1);
	    b.enter_text(6, 34, Group);
	    b.enter();
	    sleep(1);
	    b.enter_text(7, 26, EFFdate);
	    //b.enter();
	    b.enter_text(13, 3, "S");
	    //b.enter();
	    sleep(1);
	    b.F10();
	    sleep(1);
	    b.F10();
	    sleep(1);
	    b.F10();
	    sleep(1);
	    b.F10();
	    sleep(1);
	    b.F10();
	    sleep(1);
	    b.F10();
	    sleep(1);
	    
	    String EID = (String)field_4_47().getProperty("text");
	    System.out.println(EID);
//	    
	    sheet1.getRow(i).createCell(13).setCellValue(EID);
	    FileOutputStream output = new FileOutputStream(src);
	    wb.write(output);
	    output.close();
	    
	    sleep(1);
	    //b.get_text(4, 47, 56);
	    //b.F3();
	    //sleep(1);
	    //b.enter_text(5, 22, "C1"); 
	    //b.enter();
	    //b.F10();
//	    String EID = b.get_text(4, 47);
//	    System.out.println(EID);
//	    
//	    sheet1.getRow(i).createCell(13).setCellValue(EID);
//	    FileOutputStream output = new FileOutputStream(src);
//	    wb.write(output);
//	    output.close();
//	    
//	    String screenValue = "";
//	    String TextPlane = "";
//	    String[] thisScreen = new String[25];
//	    int E = 1;
//	    int SC = 0;
//	    int EC = 79;
////	    int CFrow = 0;
////	    int CFcol = 0;
////	    int CFlen = 0;
//
//	    // capture screen and place in array by row
//	    TextPlane = screen().getProperty(".textPlane").toString();
//	    for (E = 1; E <= 24; E++)
//	    {
//	    thisScreen[E] = TextPlane.substring(SC, EC);
//	    SC = SC + 80;
//	    EC = EC + 80;
//	    }
	    
		
	    
	    
	    
	     }
}
	
	public String Readfromexcel(String sheet,int row,int cell) throws IOException{
		
        FileInputStream fis = new FileInputStream("C:\\Users\\AG18664\\Desktop\\Swetha\\Input file.xlsx");
        
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        
        XSSFSheet sheet1 = wb.getSheet(sheet);
        
        XSSFRow row1 = sheet1.getRow(row);
         
        XSSFCell cell1 = row1.getCell(cell);
        
        String data = cell1.getStringCellValue();
		         
        return data;
	}
	public void enter_text(int row, int col, String x){
		//Large_group_member c = new Large_group_member();
		Property p1 = new Property(".startCol", col);
		        Property p2 =  new Property(".startRow",row);   
		        Property[] properties = {p1, p2};        
 		        sleep(0.2);
		// TestObject[] lines = find(atChild(properties));        
		TestObject[] lines = find(atDescendant(properties));
		//sleep(1);
		TextGuiTestObject text_box = ((TextGuiTestObject)lines[0]);
//		text_box.waitForExistence(0.5,0.5);
		//text_box.wait
		text_box.waitForExistence(0.4,0.4);
		text_box.setText(x);
//		if(!x.equals("AG17470")){
//		try {
//			enter();
//		} catch (AWTException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		}
//		text_box.waitForExistence(0.4,0.4);
		}
//	public String get_text(int linenum, int startpos,int endpos)
//	{
//		Property p1 = new Property(".startCol", linenum);
//        Property p2 =  new Property(".startRow",startpos); 
//        Property p3 =  new Property(".startRow",endpos); 
//        Property[] a = {p1,p2,p3};
//        TestObject[] lines = find(atDescendant(a));
//		TextGuiTestObject text_box = ((TextGuiTestObject) lines[0]);
//		String EID =  text_box.getText();
//		System.out.println(EID);
//		return EID;
//	}    
//	public String get_text(int row, int col){
//		Property p1 = new Property(".startCol", col);
//		        Property p2 =  new Property(".startRow",row);   
//		        Property[] properties = {p1, p2};        
//		TestObject[] lines = find(atDescendant(properties));
//		TextGuiTestObject get_box = ((TextGuiTestObject) lines[0]);
//		//get_box.waitForExistence();
//		//text_box.setText(x);
//		String EID = get_box.getText();
//		return EID;
//		
//		}
//	
	public void enter() throws AWTException{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		}
	
	public void F3() throws AWTException{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F3);
		r.keyRelease(KeyEvent.VK_F3);
		
		}
	public void F6() throws AWTException{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F6);
		r.keyRelease(KeyEvent.VK_F6);
		
		}
	public void F10() throws AWTException{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F10);
		r.keyRelease(KeyEvent.VK_F10);
		
		}
	public void F9() throws AWTException{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_F9);
		r.keyRelease(KeyEvent.VK_F9);
		
		}
	
	public void Space() throws AWTException{
		Robot r = new Robot();
		//r.mouseMove(1, 7);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_SPACE);
		//r.mouseMove(1, 8);
		
		}
	public void escape() throws AWTException{
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
		}
	
}

