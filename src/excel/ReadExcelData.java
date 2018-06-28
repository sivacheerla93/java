package excel;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcelData {
	public static String[][] myExcelParser() throws BiffException, IOException {
		File myExcelFile = new File("Data.xls");
		Workbook objWork = Workbook.getWorkbook(myExcelFile);
		Sheet objSheet = objWork.getSheet(0);
		int cols = objSheet.getColumns();
		int rows = objSheet.getRows();
		String[][] parameterArray = new String[cols][rows];
		for (int row = 0; row < rows; row++) {
			for (int col = 0; col < cols; col++) {
				Cell objCell = objSheet.getCell(col, row);
				parameterArray[col][row] = objCell.getContents();
			}
		}
		return parameterArray;
	}

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		String[][] myData = myExcelParser();
		int col = 0;
		int rows = myData[0].length;
		for (int row = 0; row < rows; row++) {
			for (col = 0; col < myData.length; col++) {
				System.out.println(myData[col][row]);
			}
		}
	}
}
