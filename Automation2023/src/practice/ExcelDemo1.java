package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo1 {

	public static void main(String[] args) throws IOException {
		String filepath = "C:\\Users\\njain\\eclipse-workspace\\Automation2023\\Employee.xlsx";
		readDataFromExcelFile(filepath);
	}

	// Java Program to get the Excel file name
	// as an argument

	public static void readDataFromExcelFile(String excelFilePath) throws IOException
	{
		// Creating an List object of Employee type
		// Note: User defined type
		
		FileInputStream inputStream = new FileInputStream(new File(excelFilePath));

		// As used 'xlsx' file is used so XSSFWorkbook will be
		// used
		Workbook workbook = new XSSFWorkbook(inputStream);

		// Read the first sheet and if the contents are in
		// different sheets specifying the correct index
		Sheet firstSheet = workbook.getSheetAt(0);

		// Iterators to traverse over
		Iterator<Row> iterator = firstSheet.iterator();

		// Condition check using hasNext() method which holds
		// true till there is single element remaining in List

		while (iterator.hasNext()) {
			// Get a row in sheet
			Row nextRow = iterator.next();
			// This is for a Row's cells
			Iterator<Cell> cellIterator
				= nextRow.cellIterator();
			// We are taking Employee as reference.
	
			// Iterate over the cells
			while (cellIterator.hasNext()) {
				Cell nextCell = cellIterator.next();

				// Switch case variable to
				// get the columnIndex
				int columnIndex = nextCell.getColumnIndex();

				// Depends upon the cell contents we need to
				// typecast

				// Switch-case
				switch (columnIndex) {

					// Case 1
				case 0:
					// First column is alpha and hence
					// it is typecasted to String
					String name =(String)getCellValue(nextCell);
					// Break keyword to directly terminate
					// if this case is hit
					break;

					// Case 2
				case 1:
					// Second column is alpha and hence
					// it is typecasted to String
					String p= 
						(String)getCellValue(nextCell);
					// Break keyword to directly terminate
					// if this case is hit
					break;

					// Case 3
				case 2:
					// Third column is double value and
					// hence it is typecasted to Double
					double w=
						(Double)getCellValue(nextCell);
					break;

					// Note: If additional cells are present
					// then
					// they should be specified further down,
					// and POJO class should accommodate those
					// cell values
				}
			}
			// Adding up to the list
			
		}

		// Closing the workbook and inputstream
		// as it free up the space in memory
		workbook.close();
		inputStream.close();

		// Return all the employees present in List
		// object of Employee type
		
	}
	// Java Program to get the cell value
	// of the corresponding cells

	// Method
	// To get the cell value
	private static Object getCellValue(Cell cell)
	{
		System.out.println(cell.getCellType());
		// Now either do-while or switch can be used
		// to display menu/user's choice

		// Switch case is used here for illustration
		// Switch case to get the users choice
		//switch (cell.getCellType()) {

			// Case 1
			// If cell contents are string
		
		//case Cell.CELL_TYPE_STRING:
			//return cell.getStringCellValue();

			// Case 2
			// If cell contents are Boolean
		//case Cell.CELL_TYPE_BOOLEAN:
			//return cell.getBooleanCellValue();

			// Case 3
			// If cell contents are Numeric which includes
			// int, float , double etc
		//case Cell.CELL_TYPE_NUMERIC:
			//return cell.getNumericCellValue();
		//}

		// Case 4
		// Default case
		// If cell contents are neither
		// string nor Boolean nor Numeric,
		// simply nothing is returned
		return null;
	}

}
