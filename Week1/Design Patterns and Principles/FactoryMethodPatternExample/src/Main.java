public class Main {
    public static void main(String[] args) {

        Document pdf = PdfDocumentFactory.createDocument();
        pdf.open();
        pdf.close();

        Document word = WordDocumentfactory.createDocument();
        word.open();
        word.close();

        Document excel = ExcelDocumentFactory.createDocument();
        excel.open();
        excel.close();
    }
}