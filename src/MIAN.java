import java.util.Arrays;

public class MIAN {

    public static void main(String[] args) {
        DistributoreDiBevande db1 = new DistributoreDiBevande(5);
        Caffe coffi = new Caffe();
        System.out.println(db1);
        db1.caricaProdotto(coffi);

        db1.inserisciImporto(200);
        db1.scegliProdotto(24565);


        System.out.println(db1);


    }
}
