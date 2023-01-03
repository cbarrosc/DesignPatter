package solid.interfacesegregation.nocumple;

import solid.interfacesegregation.Document;

public class MultiFunctionPrinter implements Machine {
    @Override
    public void print(Document d) {
        //
    }

    @Override
    public void fax(Document d) throws Exception {
        //
    }

    @Override
    public void scan(Document d) throws Exception {
        //
    }

}
