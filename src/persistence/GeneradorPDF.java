package persistence;

import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JTable;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import views.Constants;
import views.table.JtableElement;

public class GeneradorPDF {
	private com.itextpdf.text.Font fuenteBold =new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER,16,Font.BOLD);
	private com.itextpdf.text.Font titleTable =new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER,10,Font.ROMAN_BASELINE);
	private com.itextpdf.text.Font fontTable =new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER,9,Font.ROMAN_BASELINE);
	private com.itextpdf.text.Font subtitulos =new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER,14,Font.ITALIC);
	
	private Document doc;
	FileOutputStream file; 
	public GeneradorPDF(JtableElement table,String ruta) throws DocumentException, MalformedURLException, IOException {
		doc =new Document(PageSize.A4,8,0,8,8);
		addTable(table,ruta);
		doc.close();
	}
	
	public void prueba(JtableElement table) throws FileNotFoundException, DocumentException {
		
		 
    }

   public void addTable(JtableElement table,String ruta) throws DocumentException, MalformedURLException, IOException {	  
	   JTable tableWithoutPanel = table.tableOriginal();
		FileOutputStream file = new FileOutputStream(ruta+".pdf");
		PdfWriter.getInstance(doc, file);
		PdfPTable tablePDF = new PdfPTable(tableWithoutPanel.getColumnCount());
		doc.open();
		addImage();
        PdfPCell columnHeader;
       try {
           for (int column = 0; column < tableWithoutPanel.getColumnCount(); column++) {                 
               columnHeader = new PdfPCell(new Phrase(tableWithoutPanel.getColumnName(column),titleTable));
               columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
               tablePDF.addCell(columnHeader);
           }
           tablePDF.setHeaderRows(1);
           for (int row = 0; row < tableWithoutPanel.getRowCount(); row++) {                
               for (int column = 0; column < tableWithoutPanel.getColumnCount(); column++) { 
            	tablePDF.addCell(new PdfPCell(new Phrase(tableWithoutPanel.getValueAt(row, column).toString(),fontTable)));  
               }
           } 
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
       Paragraph p =new Paragraph();
       Paragraph p2 =new Paragraph("  ");
       p.setAlignment(Element.ALIGN_LEFT);
       Chunk c= new Chunk();
	   c.setFont(subtitulos); 
	   c.append(Constants.TABLE_ALL_DATAS);
	   p.add(c);
       doc.add(p);
       doc.add(p2);
       doc.add(tablePDF);
       doc.close();  
   }
   
   private Paragraph addHeader() {
	   Paragraph p =new Paragraph();
	   Chunk c= new Chunk();
	   p.setAlignment(Element.ALIGN_CENTER);
	   c.setFont(fuenteBold);
	   c.append(Constants.PISCICULTURE_IN_BOYACA);
	   p.add(c);
	   return p;
	   
   }
   private void addImage() throws DocumentException, MalformedURLException, IOException {
	   doc.add(addHeader());
	   Image img = Image.getInstance("Resources/logo.png");
	   img.scaleAbsolute(100, 100);
	   img.setAlignment(Element.ALIGN_CENTER);
	   doc.add(img);
	   
	   
   }
	

}

