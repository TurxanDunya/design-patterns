package gangoffour.creational.factoryWithSupplier;

import java.util.function.Supplier;

public enum EnumFactory {

    PDF(PdfGenerator::new),
    EXCEL(ExcelGenerator::new);

    public final Supplier<FileGenerator> supplier;

    EnumFactory(Supplier<FileGenerator> supplier) {
        this.supplier = supplier;
    }

    public FileGenerator getInstance() {
        return this.supplier.get();
    }

}