
import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import resources.Script1Helper;

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
import com.sun.media.sound.InvalidFormatException;
import com.ibm.rational.test.ft.object.interfaces.sapwebportal.*;
/**
 * Description   : Functional Test Script
 * @author AG18664
 */
public class Script1 extends Script1Helper
{
	/**
	 * Script Name   : <b>Script1</b>
	 * Generated     : <b>Mar 6, 2019 12:57:22 PM</b>
	 * Description   : Functional Test Script
	 * Original Host : WinNT Version 10.0  Build 16299 ()
	 * 
	 * @since  2019/03/06
	 * @author AG18664
	 */
	public void testMain(Object[] args) throws IOException 
	{
	{
		startApp("Extension for Terminal Applications");
		sleep(3);
		Property h1 = new Property(".class", "com.ibm.terminal.tester.gui.misc.AccessibleTextField");
		        Property h2 =  new Property(".classIndex","0");
		        Property[] properties = {h1, h2};        
		TestObject[] t = find(atDescendant(properties));
		for(int i = 1; i<=t.length; i++ ){
		System.out.println(i);
		}
		TextGuiSubitemTestObject ipAdd = (TextGuiSubitemTestObject)t[0];
		        ipAdd.setText("30.132.202.1");
		Property p1 = new Property(".class", "javax.swing.JButton");
		        Property p2 =  new Property("toolTipText","Connect Using the Current Connection Properties");
		        Script1 c = new  Script1();
		    //    GuiTestObject connectButton = c.objectID(p1, p2);
		//connectButton.click();  
		sleep(5);
		//c.enter_text(20, 3, "gateway1");
	}
	}
}
