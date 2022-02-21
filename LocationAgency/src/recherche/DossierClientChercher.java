package recherche;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DossierClientChercher {

    public DossierClientChercher() {
        System.out.println("Chercher dossier client ...");
    }

    public static Row rechercheClient(String nbPermisR) {

        FileInputStream file;
        String columnToSearchName = "nbPermis";
        int columnToSearchIndex = 0;
        String cellValue = "", cellValue2 = "";
        Cell cell;
        try {
            file = new FileInputStream("db/Location_Agency_db.XLSX");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheet("DossierClient");
            
            // Récupérer la première ligne
            Row firstRow = sheet.getRow(0);
            int firstColumnIndex = firstRow.getFirstCellNum();
            int lastColumnIndex = firstRow.getLastCellNum();
            for (int i = firstColumnIndex; i < lastColumnIndex; i++) {
            	cellValue = firstRow.getCell(i).getRichStringCellValue().getString().trim();
            	if (cellValue.equals(columnToSearchName)) {
            		columnToSearchIndex = i;
            		break;
            	}
            }
            
            for (Row row : sheet) {
            	cell = row.getCell(columnToSearchIndex);
            	if (cell == null) {
            		continue;
            	}
            	switch(cell.getCellType()) {
	            	case Cell.CELL_TYPE_NUMERIC:
	            		System.out.println(cell.getNumericCellValue());
	                    break;
	                case Cell.CELL_TYPE_STRING:
	                	cellValue2 = cell.getRichStringCellValue().getString().trim();
	                	if( cellValue2.equals(nbPermisR) ) {
	                		cell.getStringCellValue();
		            		System.out.println("Found ...");
            				return row;
	                	}
	            	default:
	            		System.out.println("Type not found");
	            		break;
            	}
            }

            return null;

        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            return null;
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return null;
        }
    }
}
