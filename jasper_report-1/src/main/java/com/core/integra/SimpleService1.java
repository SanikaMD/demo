package com.core.integra;

import java.util.*;

import org.springframework.web.bind.annotation.ModelAttribute;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class SimpleService1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String s = "C:\\Users\\Administrator\\eclipse-workspace\\jasper_report-1\\src\\main\\resources\\Simple_Blue_1.jrxml";
			Map<String,Object> p=new HashMap<String,Object>();
			Student s1 = new Student(1,"Sandhya",50);
			Student s2 = new Student(2,"Salman",10);
			Student s3 = new Student(15,"Sandhy65a",50);
			Student s4 = new Student(26,"Salman56",10);
			Student s5 = new Student(167,"Sandhya5",5);
			Student s6 = new Student(278,"Salman56",20);
			
			
			List<Student> list = new ArrayList<Student>();
			list.add(s1);
			list.add(s2);
			list.add(s3);
			list.add(s4);
			list.add(s5);
			list.add(s6);
			
			System.out.println("it is coming till here");
			JRBeanCollectionDataSource bd = new JRBeanCollectionDataSource(list);
			
			//JasperReport report = JasperCompileManager.compileReport(s);
			System.out.println("it is coming till here");	
			JasperReport report = JasperCompileManager.compileReport(s);
			JasperPrint print = JasperFillManager.fillReport(report, p, bd);
			System.out.println("it is coming till here");
			JasperExportManager.exportReportToPdfFile(print, "C:\\Users\\Administrator\\eclipse-workspace\\jasper_report\\src\\main\\resources\\Sanika.pdf");
			
			System.out.println("report created");
		}
		catch(Exception e) 
		{
			
			System.out.println(e);
		}
	}

}