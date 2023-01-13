package excelread;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class e1 {

	@Test
	public void rw()
	{
		File f= new File("C:\\Users\\user\\Desktop\\TestCaseTemplate demoqa PREM DEC27.xlsx");
		FileInputStream fis= new FileInputStream(f);
		XSSFWorkbook x= new XSSFWorkbook(fis);
		XSSFSheet sheet = x.getSheetAt(0);
		// number of rows :  
		int row=sheet.getLastRowNum();
		System.out.println("Number of rows "+ row);
		// number of columns=> know the row number
		int col=sheet.getRow(0).getLastCellNum();
		System.out.println("Number of columns in row "+ col);
		// 1,2
		XSSFCell data = sheet.getRow(1).getCell(2);
		System.out.println(data);
		
		//writing
		//59.2
		sheet.getRow(59).createCell(2).setCellValue("DEEPA");
		FileOutputStream fos= new FileOutputStream(f);
		x.write(fos);

	}
	
}
