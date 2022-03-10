public class Bevande {
    private int barcode;
    private int prezzo;

    public Bevande(int barcode, int prezzo) {
        this.barcode = barcode;
        this.prezzo = prezzo;
    }
    public Bevande(){
        this.barcode=0;
        this.prezzo=0;

    }

    public int getBarcode() {
        return barcode;
    }

    public void setBarcode(int barcode) {
        this.barcode = barcode;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
}
