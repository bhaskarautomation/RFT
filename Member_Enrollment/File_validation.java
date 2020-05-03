
import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import resources.File_validationHelper;

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
public class File_validation extends File_validationHelper
{
	/**
	 * Script Name   : <b>File_validation</b>
	 * Generated     : <b>Jul 25, 2019 1:57:16 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 16299 ()
	 * 
	 * @since  2019/07/25
	 * @author AG18664
	 */
	public void testMain(Object[] args) 
	{
		
		
		
		XSSFSheet Sheet;

		File src = new File("C:\\Users\\ac61027\\Desktop\\Contracts.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		//Sheet = wb.getSheet("Script");

		Sheet = wb.getSheet("Sheet");

		startApp("Extension for Terminal Applications"); 
		sleep(6);
		
		Property[] properties = new Property[2];
		properties[0] = new Property(".class", "com.ibm.terminal.tester.gui.misc.AccessibleTextField");
		properties[1]= new Property(".classIndex", "0");
		sleep(0.3);
		TestObject[] text = find(atDescendant(properties));
		TextGuiSubitemTestObject IPaddress = ((TextGuiSubitemTestObject)text[0]);
		IPaddress.waitForExistence();
		IPaddress.setText("30.130.200.57");
		
		
		Property b1 = new Property(".class","javax.swing.JButton");
		Property b2 = new Property(".classIndex","4");
		Property[] propertie = {b1,b2};
		TestObject[] a = find(atDescendant(propertie));
		((GuiTestObject)a[0]).click();
    	sleep(2);
    	
    	
		File_validation b = new File_validation();
		String Userid = b.Readfromexcel("Credentials",0,1);
		String password = b.Readfromexcel("Credentials",1,1);
		
	
		field_20_3().click(atPoint(8,20));
		ibmExtensionForTerminalBasedAp().inputChars("gateway1");
		ibmExtensionForTerminalBasedAp().inputKeys("{ENTER}");
		//ibmExtensionForTerminalBasedAp().inputKeys("wa{ExtLeft}{ExtLeft}gateway1{ENTER}");
		ibmExtensionForTerminalBasedAp().inputKeys("A151XT9");
		ibmExtensionForTerminalBasedAp().inputKeys("mar@2019{ENTER}");
		ibmExtensionForTerminalBasedAp().inputKeys("t tsoa{ENTER}");
		ibmExtensionForTerminalBasedAp().inputKeys("2{ENTER}");
		ibmExtensionForTerminalBasedAp().inputKeys("s tsoa{ENTER}");
		ibmExtensionForTerminalBasedAp().inputKeys("ispf{ENTER}");
		ibmExtensionForTerminalBasedAp().inputKeys("i.3.4{ENTER}");
		//com.ibm.terminal.tester.ft.value.TerminalColor File = 
		  // (com.ibm.terminal.tester.ft.value.TerminalColor)field_9_24_2().getProperty("background");
		//field_9_24_2().click();
		//field_9_24().click(atPoint(2,13));



		// 
		field_9_24().click(atPoint(5,20));

		//field_9_24().click();
		// 
		//field_20_3_2().click(atPoint(45,42));
		//ibmExtensionForTerminalBasedAp().inputKeys("{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}");
		//field_20_3_3().click(atPoint(30,40));
		//ibmExtensionForTerminalBasedAp().inputKeys("{ExtDelete}");
		ibmExtensionForTerminalBasedAp().inputKeys("U.D.FD88710M.ECCD.MEMBER.G0190V00{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}{ExtDelete}");
		ibmExtensionForTerminalBasedAp().inputKeys("{ENTER}");


		// U.D.M.FD887104.AIM.XTRCT.G0011V00
		//field_7_2().click(atPoint(24,21));
		//field_7_2().click(atPoint(23,17));
		//ibmExtensionForTerminalBasedAp().inputChars("b");
		//field_7_2().dragToScreenPoint(atPoint(25,19), field_7_2().getScreenPoint(atPoint(25,20)));
		//field_7_2().click(atPoint(25,20));
		//field_7_2().click(atPoint(25,20));
		//field_7_2().click(atPoint(25,20));
		//field_7_2().click(atPoint(28,17));
		// 
		//  field_7_2_2().click(atPoint(19,11));
		//ibmExtensionForTerminalBasedAp().inputKeys("{TAB}");
		ibmExtensionForTerminalBasedAp().inputChars("b");
		//ibmExtensionForTerminalBasedAp().inputChars("b");

		//field_7_2().click();
		ibmExtensionForTerminalBasedAp().inputKeys("{ENTER}");


		for(int i=1;i<=Sheet.getLastRowNum();i++)

		{
		// 
		DataFormatter Formatter = new DataFormatter();

		String Contracts = Formatter.formatCellValue(Sheet.getRow(i).getCell(0));

		field_22_15_2().click(atPoint(5,18));


		//field_22_15().click();
		ibmExtensionForTerminalBasedAp().inputChars("f ");

		ibmExtensionForTerminalBasedAp().inputKeys(Contracts);

		// ibmExtensionForTerminalBasedAp().inputKeys(dpString("Contract"));

		ibmExtensionForTerminalBasedAp().inputKeys("{ENTER}");

		String Data = (String)field_3_63().getProperty("text");

		        
		/*
		//Property[] property = new Property[2];
		         
		        // property[0] = new Property(".class","com.ibm.eNetwork.ECL.ECLField");
		        
		      //   property[1] =  new Property(".startCol","56");
		     
		         //property[2]  =  new Property(".startRow","3");
		    
		        //Property p3 = new Property(".length","24");
		Property p1 = new Property(".class","com.ibm.eNetwork.ECL.ECLField");

		Property p2 = new Property(".startCol","56"); 

		        Property[] property = {p1, p2};      
		         
		           
		         TestObject[] candidates = find(atDescendant(property));
		     //System.out.println("Found "+ candidates.length + " objects");
		         
		         if(candidates != null)
		         
		         {
		     
		         String Data = ((TextGuiTestObject)candidates[0]).getText();
		         
		         Sheet.getRow(i).createCell(1).setCellValue(Data);
		         
		         }
		    
		*/
		          // System.out.print(Data);
		//Property p4 = new Property(".startRow","3");

		//Property p3 = new Property(".length","24");

		//Property[] properties = {p1, p2}; 

		      //TestObject[] candidates = find(atDescendant(properties));
		//System.out.println("Found "+ candidates.length + " objects"); 

		//String Data = ((TextGuiTestObject)candidates[]).getText();

		           field_22_15_2().click(atPoint(5,18));

		    ibmExtensionForTerminalBasedAp().inputKeys("M{F7}");

		    ibmExtensionForTerminalBasedAp().inputKeys("{ENTER}");

		// GuiTestObject GTO = (GuiTestObject)candidates[0];

		//String Data = (String)GTO.getProperty(".text"); 




		//field_7_2().click();
		//System.out.println(Field_3_56_text);


		//field_22_15_2().click(atPoint(4,18));
		// 



		      Sheet.getRow(i).createCell(1).setCellValue(Data);

		//Bottom of data reached

		// String text = "*Bottom of data reached*";

		//System.out.println(Field_3_56_text);

		//String Field_3_56_background = 
		// (String)field_3_56_2().getProperty("background");


		// Specify the file in which data needs to be written.

		FileOutputStream fileOutput = new FileOutputStream(src);

		// finally write content

		wb.write(fileOutput);

		// close the file
		fileOutput.close();


		// 

		// 
		//field_3_56_2().performTest(Field_3_56_textVP());

		/*
		// 
		field_23_15().click(atPoint(11,18));
		field_23_15().click(atPoint(69,19));
		String Command_line = (String)field_23_2().getProperty("text");
		String Line = (String)field_23_15_2().getProperty("text");
		Line.click();
		if(Line.equals(" "))
		{
		click();
		ibmExtensionForTerminalBasedAp().inputKeys(Contracts);
		}
		*/
		}
		}

		}






		
		
	}
}

