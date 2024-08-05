package tollPlaza;

import javax.swing.JOptionPane;
import java.lang.System;
class Toll
{
	int tpass;
	int tcpass;
	int tbpass;
	int ttpass;
	double gt;
	int op;
	int ch=1;
	public static void main(String[] args)
	 {
		Toll abc;
		abc=new Toll();
	 }
    Toll()
    {
    	String str;
    	int op1=1;
    	if(ch==1)
    	{
            tpass=tcpass=tbpass=ttpass=0;
            gt=0.0;
            ch=0;
    	}
    	while(op1!=0)
    	 {	
    	        str=JOptionPane.showInputDialog(null,"*********TOLL PLAZA**********\n**********MENU**********\n1.Toll pass\n2.Total Vehicle passes\n3.Grand Total\n4.Exit\nEnter choice");
                op=Integer.parseInt(str);
                if(op>0&&op<5)
                 {                	
                	switch(op)
                	{
                		case 1:tollpay();
                		       break;
                		case 2:atp();
                		       break;
                		case 3:gt();
                		       break;
                		case 4:System.exit(0);               		               		       
                	}
                 }
                else
                   JOptionPane.showMessageDialog(null,"Invalid choice");
                
         }           	
    }
    int tollpay()
    {
    	String str;
    	int op1=1;
    	while(op1!=0)
    	 {	
    	       str=JOptionPane.showInputDialog(null,"****************TOLL PLAZA*****************\nSELECT VEHICLE\n1.CAR:40/- WITHIN 24 HR RETURN +20/- ELSE +40/-\n2.BUS:200/- WITHIN 24 HR RETURN +100/- ELSE +200/-\n3.TRUCK:100/-WITHIN 24 HR RETURN +50/- ELSE +100/-\n4.RETURN TO MENU");
               op=Integer.parseInt(str);
               if(op>0&&op<5)
                {              
                    switch(op)
                    {
                      case 1:cpay();
                             op1=0;
                             break;
                      case 2:bpay();
                             op1=0;
                             break;
                      case 3:tpay();
                             op1=0;
                             break;
                      case 4:op1=0;
                             break;                                              
                    }
                }
                else
                     JOptionPane.showMessageDialog(null,"Invalid choice");                    
         }
      return 0;          
    }
    int cpay()
    {
    	String te=JOptionPane.showInputDialog(null,"Enter return time(default time:00:00):");
        String teparse[]=te.split(":");
        int hr=Integer.parseInt(teparse[0]);
        int min=Integer.parseInt(teparse[1]);
        double t=hr+(min/60.00),temp=0;
        if(t<=24.00)
        	temp=temp+40+20;
        else
        	temp=temp+40+40;
        JOptionPane.showMessageDialog(null,"Amount:"+temp+"\nClick Ok to pay and Proceed Menu");
        gt=gt+temp;
        ++tcpass;
        return 0;
    }
    int bpay()
    {
    	String te=JOptionPane.showInputDialog(null,"Enter return time(default time:00:00):");
        String teparse[]=te.split(":");
        int hr=Integer.parseInt(teparse[0]);
        int min=Integer.parseInt(teparse[1]);
        double t=hr+(min/60.00),temp=0;
        if(t<=24)
        	temp=temp+200+100;
        else
        	temp=temp+200+200;
        JOptionPane.showMessageDialog(null,"Amount:"+temp+"\nClick Ok to pay and Proceed Menu");
        gt=gt+temp;
        ++tbpass;
        return 0;
    }
    int tpay()
    {
    	String te=JOptionPane.showInputDialog(null,"Enter return time(default time:00:00):");
        String teparse[]=te.split(":");
        int hr=Integer.parseInt(teparse[0]);
        int min=Integer.parseInt(teparse[1]);
        double t=hr+(min/60.00),temp=0;
        if(t<=24)
        	temp=temp+100+50;
        else
        	temp=temp+100+100;
        JOptionPane.showMessageDialog(null,"Amount:"+temp+"\nClick Ok to pay and Proceed Menu");
        gt=gt+temp;
        ++ttpass;
        return 0;
    }
    int atp()
    {
    	JOptionPane.showMessageDialog(null,"*********TOLL PLAZA**********\nTOTAL VEHICLE PASSES:"+tpass+"\nTOTAL CAR PASSES:"+tcpass+"\nTOTAL TRUCK PASSES:"+ttpass+"\nTOTAL BUS PASSES:"+tbpass+"\nCLICK OK AND PROCEED TO MENU");
        return 0;	
    }
    int gt()
    {
        tpass=tcpass+tbpass+ttpass;
        JOptionPane.showMessageDialog(null,"*********TOLL PLAZA**********\nGRAND TOTAL:"+gt+"\nCLICK OK AND PROCEED TO MENU");
        return 0;
    }
}