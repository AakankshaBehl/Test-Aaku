package utils;

public class excelutilsdemo {

	public static void main(String[] args) {



		String path = System.getProperty("user.dir");

		excelutils excel = new excelutils(path+"\\excel\\data.xlsx", "Sheet1");

		excel.getRowCount();
		excel.getCellDataNumber(1, 1);
		excel.getCellDataString(0, 0);
	}

}
