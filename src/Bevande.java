public class Bevande {
    private String barcode;
    private double prezzo;

    public Bevande(String barcode, double prezzo) {
        this.barcode = barcode;
        this.prezzo = prezzo;
    }
    public Bevande(){
        this.barcode="";
        this.prezzo=0;

    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
