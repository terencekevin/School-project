package dossierClient;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import domaineClasse.DossierClient;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFrame;

//not its Connection class
public class DossierClientData {

	public DossierClientData() {
		System.out.println("Création du dossier client ...");
	}

	public static void enregistrerClient(String nbPermisIn, String nomIn, String prenomIn, String dateDeNaissanceIn,
			String classePermisIn, String adresseClientIn, String telephonneIn, String dateExpirationPermisIn) {

		FileInputStream file;
		FileOutputStream outputStream;

		try {
			file = new FileInputStream("db/Location_Agency_db.XLSX");

			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("DossierClient");
			int rowNum = sheet.getLastRowNum();
			rowNum += 1;
			
//			DossierClient dossierClient = new DossierClient()
			Object[][] datatypes = { { nbPermisIn, nomIn, prenomIn, dateDeNaissanceIn, classePermisIn, adresseClientIn,
					telephonneIn, dateExpirationPermisIn }

			};

			for (Object[] datatype : datatypes) {
				Row row = sheet.createRow(rowNum++);
				int colNum = 0;
				for (Object field : datatype) {
					Cell cell = row.createCell(colNum++);
					if (field instanceof String) {
						cell.setCellValue((String) field);
					} else if (field instanceof Integer) {
						cell.setCellValue((Integer) field);
					}
				}
			}

			outputStream = new FileOutputStream("db/Location_Agency_db.XLSX");
			workbook.write(outputStream);
			workbook.close();

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Done");
	}

	public static String[] rechercheClient(String nbPermisR) {
		String nom = "";
		String prenom = "";
		String dateDeNaissance = "";
		String classePermis = "";
		String adresseClient = "";
		String telephonne = "";
		String dateExpiration = "";

		FileInputStream file;
		try {
			file = new FileInputStream("Z:\\DatabaseMODLocationAgency\\Location_Agency_db.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheet("Dossier Client");
			for (Row row : sheet) {
				for (Cell cell : row) {
					if (cell.getRichStringCellValue().getString().trim().equals(nbPermisR)) {
						nom = row.getCell(cell.getColumnIndex() + 1).getStringCellValue();
						prenom = row.getCell(cell.getColumnIndex() + 2).getStringCellValue();
						dateDeNaissance = row.getCell(cell.getColumnIndex() + 3).getStringCellValue();
						classePermis = row.getCell(cell.getColumnIndex() + 4).getStringCellValue();
						adresseClient = row.getCell(cell.getColumnIndex() + 5).getStringCellValue();
						telephonne = row.getCell(cell.getColumnIndex() + 6).getStringCellValue();
						dateExpiration = row.getCell(cell.getColumnIndex() + 7).getStringCellValue();
						/*		
						nbPermisIn, nomIn, prenomIn, dateDeNaissanceIn, classePermisIn, adresseClientIn,
						telephonneIn, dateExpirationPermisIn */
						
						/*for (Cell cellR : cell.getRow()) {
							if (cell.getColumnIndex() == 1) {
								
								
							}
						}*/
					}
					
				}
			}			

		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JFrame frame = new InterfaceDossierClient();
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       frame.setVisible(true);
		return new String [] {nbPermisR, nom, prenom, dateDeNaissance, classePermis, adresseClient, adresseClient, telephonne, dateExpiration} ;
				
	}


	// Main driver method

	/*
	 * XSSFWorkbook workbook = new XSSFWorkbook(); XSSFSheet sheet =
	 * workbook.createSheet("Dossier Client");
	 * 
	 * Object[][] datatypes = { {"nbPermis", "nom", "prenom", "dateDeNaissance",
	 * "classePermis", "permisValide"}, {"QWER093845034", "Jean", "Michel",
	 * "1996/07/08", "C", "True"}, {"ASDF798447654", "Shacotte", "Labiscotte",
	 * "1990/05/01", "D", "False"},
	 * 
	 * };
	 * 
	 * int rowNum = 0; System.out.println("Creating excel");
	 * 
	 * for (Object[] datatype : datatypes) { Row row = sheet.createRow(rowNum++);
	 * int colNum = 0; for (Object field : datatype) { Cell cell =
	 * row.createCell(colNum++); if (field instanceof String) {
	 * cell.setCellValue((String) field); } else if (field instanceof Integer) {
	 * cell.setCellValue((Integer) field); } } }
	 * 
	 * try { FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
	 * workbook.write(outputStream); workbook.close(); } catch
	 * (FileNotFoundException e) { e.printStackTrace(); } catch (IOException e) {
	 * e.printStackTrace(); }
	 * 
	 * System.out.println("Done");
	 */
}
