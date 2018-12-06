package cl.clubhipico.clubhipico_rsalazar.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.lowagie.text.Cell;
import com.lowagie.text.Row;
*/
public class DocumentoXLS {
	
	/*private HSSFWorkbook workbook;
	private HSSFSheet selectedSheet;
	private String fileName;
	public DocumentoXLS() {
		workbook = new HSSFWorkbook();
		workbook.createSheet("Sheet 1");
		this.selectedSheet = workbook.getSheetAt(0);
	}
	public DocumentoXLS(HSSFWorkbook book){
		this.workbook=book;
		workbook.createSheet("Sheet 1");
		this.selectedSheet = workbook.getSheetAt(0);
	}
	public HSSFSheet getSelectedSheet() {
		return selectedSheet;
	}

	public void setData(String[] labelColumnas, String[] columnas, List<HashMap<String,Object>> list,String fileName){
		this.fileName=fileName;
		
		List<Object[]> data = new ArrayList<Object[]>();
		
		//Header
		ArrayList<Object> arregloCeldasHeader = new ArrayList<Object>();
		for (int i=0; i<columnas.length; i++){
			arregloCeldasHeader.add(labelColumnas[i]);
		}
		
		data.add(arregloCeldasHeader.toArray());
		
		for (HashMap<String,Object> hash : list){
			ArrayList<Object> arregloCeldas = new ArrayList<Object>();
			for (int i=0; i<columnas.length; i++){	
				if (hash.containsKey(columnas[i]))
					arregloCeldas.add(hash.get(columnas[i]));
				else
					arregloCeldas.add("");
			}
			data.add(arregloCeldas.toArray());
		}
		
		System.out.println(data.toString());
		int rownum = 0;
		for (Object[] rowObject: data) {
		    HSSFRow row = this.getSelectedSheet().createRow(rownum++);
		    
		    int cellnum = 0;
		    for (Object obj : rowObject) {
		        HSSFCell cell = row.createCell(cellnum++);
		        if (obj==null)
		        	cell.setCellValue("");
		        else if (obj instanceof String)	
		        	cell.setCellValue((String)obj);
		        else if (obj instanceof Integer)	
		        	cell.setCellValue((Integer)obj);
		        else if (obj instanceof Double)	
		        	cell.setCellValue((Double)obj);
		        else if (obj instanceof Float)	
		        	cell.setCellValue((Float)obj);
		        else
		        	cell.setCellValue("####");
		    }
		}
	}
	
	public void generate(HttpServletResponse response) throws IOException{
		response.setHeader("Content-disposition", "inline; filename=\""+fileName+"\"");

		OutputStream out = response.getOutputStream();
		workbook.write(out);
		out.close();
	}
	
	public void generate(String fileName) throws IOException{
		FileOutputStream out = new FileOutputStream(new File(fileName));
		workbook.write(out);
		out.close();
	}*/
}
