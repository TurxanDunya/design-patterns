package gangoffour.creational.factoryWithSupplier;

public class Client {
    public static void main(String[] args) {
        FileGenerator pdfGeneratorInstance = EnumFactory.PDF.getInstance();
        System.out.println("This is pdf generator instance: " + pdfGeneratorInstance);

        FileGenerator excelGeneratorInstance = EnumFactory.EXCEL.getInstance();
        System.out.println("This is excel generator instance: " + excelGeneratorInstance);
    }
}