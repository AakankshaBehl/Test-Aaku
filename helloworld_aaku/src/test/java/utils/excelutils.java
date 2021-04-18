package utils;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelutils {

	static String path;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;


	public excelutils(String excelpath,String sheetname)

	{
		try {
			path = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelpath);
			sheet = workbook.getSheet(sheetname);
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {	

		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);

	}

	public static void getRowCount()
	{

		try {

			int rowcount = sheet.getPhysicalNumberOfRows();

			System.out.println("Row Count="+rowcount);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}


	public static void getCellDataString(int rownum, int colnum)

	{
		try {

			String cellData = sheet.getRow(rownum).getCell(colnum).getStringCellValue();
			System.out.println(cellData);


		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}



	}

	public static void getCellDataNumber(int rowNum, int colNum)

	{
		try {

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}



	}
}


