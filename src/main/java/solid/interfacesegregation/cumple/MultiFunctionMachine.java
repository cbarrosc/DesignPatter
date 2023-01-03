package solid.interfacesegregation.cumple;

import solid.interfacesegregation.Document;

public class MultiFunctionMachine implements MultiFunctionDevice {

    private final Printer printer;
    private final Scanner scanner;

    public MultiFunctionMachine(Printer printer, Scanner scanner) {
        this.printer = printer;
        this.scanner = scanner;
    }

    @Override
    public void print(Document d) {
        printer.print(d);
    }

    @Override
    public void scan(Document d) {
        scanner.scan(d);
    }
}
