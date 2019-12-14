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
import views.table.JtableElement;

public class GeneradorPDF {
	private com.itextpdf.text.Font fuenteBold =new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER,16,Font.BOLD);
	private com.itextpdf.text.Font titleTable =new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER,10,Font.ROMAN_BASELINE);
	private com.itextpdf.text.Font fontTable =new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER,9,Font.ROMAN_BASELINE);
	private com.itextpdf.text.Font subtitulos =new com.itextpdf.text.Font(com.itextpdf.text.Font.FontFamily.COURIER,14,Font.ITALIC);
//	private Font fuenteNormal =new Font(Constants.FONT_RUBIK, 10, Font.ROMAN_BASELINE);
//	private Font fuenteItalic =new Font(Constants.FONT_RUBIK, 10, Font.ITALIC);
	
	private Document doc;
	FileOutputStream archivo; 
	public GeneradorPDF(JtableElement table,String ruta) throws DocumentException, MalformedURLException, IOException {
		doc =new Document(PageSize.A4,8,0,8,8);
//		archivo = new FileOutputStream(ruta+".pdf");
		//prueba(table);
		addTable(table,ruta);
		doc.close();
	}
	
	public void prueba(JtableElement table) throws FileNotFoundException, DocumentException {
		
		 
    }

   public void addTable(JtableElement table,String ruta) throws DocumentException, MalformedURLException, IOException {	  
	   JTable tableSinPanel = table.tableOriginal();
//		tableSinPanel.setFont(new Font(Constants.FONT_RUBIK, Font.BOLD,8));
		FileOutputStream archivo = new FileOutputStream(ruta+".pdf");
		
		PdfWriter.getInstance(doc, archivo);
		
		PdfPTable tablePDF = new PdfPTable(tableSinPanel.getColumnCount());
	
//       anchor.setName("Table export to PDF (Exportamos la tabla a PDF)");
//		Anchor anchor = new Anchor("Tabla con todos los datos\t\t\t\t\t");
		
//       anchor.setFont(fuenteBold);
//	    Chapter catPart = new Chapter(new Paragraph(anchor), 1);
//		table.tableOriginal().getColumnCount();
		doc.open();
		addImage();
//		doc.addTitle("tabla con todos los datos");
//		doc.addSubject("Using iText (usando iText)");
//		doc.addKeywords("Java, PDF, iText");
//		doc.addAuthor("Código Xules");
//		doc.addCreator("Código Xules");
		
	      // Now we fill the rows of the PdfPTable (Ahora llenamos las filas de PdfPTable)
       PdfPCell columnHeader;
//       Paragraph subPara = new Paragraph("tabla con todos los datos", fuenteBold);
//       Section subCatPart = catPart.addSection(subPara);
//       subCatPart.add(new Paragraph("This is a simple example (Este es un ejemplo sencillo)"));
       try {
           for (int column = 0; column < tableSinPanel.getColumnCount(); column++) {                 
               columnHeader = new PdfPCell(new Phrase(tableSinPanel.getColumnName(column),titleTable));
               columnHeader.setHorizontalAlignment(Element.ALIGN_CENTER);
             
               tablePDF.addCell(columnHeader);
           }
           tablePDF.setHeaderRows(1);
           for (int row = 0; row < tableSinPanel.getRowCount(); row++) {                
               for (int column = 0; column < tableSinPanel.getColumnCount(); column++) { 
            	tablePDF.addCell(new PdfPCell(new Phrase(tableSinPanel.getValueAt(row, column).toString(),fontTable)));  
//               	tablePDF.addCell(tableSinPanel.getValueAt(row, column).toString());
               }
           } 
		} catch (NullPointerException e) {
			// TODO: handle exception
		}
       Paragraph p =new Paragraph();
       Paragraph p2 =new Paragraph("  ");
       p.setAlignment(Element.ALIGN_LEFT);
       Chunk c= new Chunk();
//       Chunk c2= new Chunk();
	   c.setFont(subtitulos); 
	   c.append("Tabla con todos los datos:");
	   p.add(c);
       doc.add(p);
       doc.add(p2);
       doc.add(tablePDF);
//       subCatPart.add(tablePDF);
//       doc.add(subCatPart);
       doc.close();
   

       
   }
   private Paragraph addHeader() {
	   Paragraph p =new Paragraph();
	   Chunk c= new Chunk();
	   p.setAlignment(Element.ALIGN_CENTER);
//	   p.setFont(fuenteBold);
	   c.setFont(fuenteBold);
	   c.append("PSICULTURA EN BOYACA");
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

