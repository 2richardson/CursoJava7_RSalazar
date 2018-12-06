package cl.clubhipico.clubhipico_rsalazar.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/*import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.docx4j.org.xhtmlrenderer.pdf.ITextRenderer;
import org.dom4j.DocumentException;
import org.htmlcleaner.CleanerProperties;
import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.PrettyXmlSerializer;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XmlSerializer;
*/

public class DocumentoPDF {

   /* protected static Logger logger = Logger.getLogger(DocumentoPDF.class); 

	public DocumentoPDF() {
	}

	public BytesDocumento generateBytes(String html, String nombreArchivo) throws DocumentException, IOException, com.lowagie.text.DocumentException{

		HtmlCleaner cleaner = new HtmlCleaner();
		CleanerProperties props = cleaner.getProperties();

	    TagNode node = cleaner.clean(html);
	    final XmlSerializer xmlSerializer = new PrettyXmlSerializer(props);
	    final String html1 = xmlSerializer.getAsString(node);
	    logger.info("html limpio:"+html1);
	   
	    ITextRenderer renderer = new ITextRenderer();
	    renderer.setDocumentFromString(html1);

		ByteArrayOutputStream  out = new ByteArrayOutputStream();
	    renderer.layout();
	    renderer.createPDF(out);
	    out.flush();
	    out.close();
	    
	    BytesDocumento documento = new BytesDocumento();
		documento.setArchivo(out.toByteArray());
		documento.setTipo("aplication/pdf");
		documento.setNombreArchivo(nombreArchivo);
		
		return documento;
	}
	
	public void generate(String html, HttpServletRequest request,HttpServletResponse response) throws IOException, DocumentException, com.lowagie.text.DocumentException {

		response.setContentType("application/pdf; charset=UTF-8");
		response.setHeader("Content-disposition", "inline; filename=\"Comprobante Pago.pdf\"");
		
	  	HtmlCleaner cleaner = new HtmlCleaner();
		CleanerProperties props = cleaner.getProperties();

	    TagNode node = cleaner.clean(html);
	    final XmlSerializer xmlSerializer = new PrettyXmlSerializer(props);
	    final String html1 = xmlSerializer.getAsString(node);
	    logger.info("html limpio:"+html1);
	   
	    ITextRenderer renderer = new ITextRenderer();
	    renderer.setDocumentFromString(html1);

	    OutputStream os = response.getOutputStream();
	    renderer.layout();
	    renderer.createPDF(os);
	    os.flush();
	    os.close();
	
	}*/
}