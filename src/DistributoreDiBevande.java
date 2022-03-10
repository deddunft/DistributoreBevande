import java.util.Arrays;

public class DistributoreDiBevande {

    private Bevande[] distrC;
    private Bevande[] distrCp;
    private int num;
    private double saldo;

    public DistributoreDiBevande(int num){
        /*distrC = new Bevande[num];
        distrCp = new Bevande[num];
        for (int i = 0; i < num; i++) {
            distrC[i] = new Caffe();
            distrCp[i] = new Cappuccino();

        }*/

        this.num= num;
    }
    public void caricaProdotto(Bevande bevande){
        distrC = new Bevande[num];
        for (int i = 0; i < num; i++) {
            distrC[i]= bevande;
        }

    }

    public double getSaldo() {
        return saldo;
    }

    public void inserisciImporto(double soldi){
        saldo = getSaldo()+soldi;
    }

    public void scegliProdotto(int barc){
        for (int i = 0; i <num ; i++) {


            if (distrC[i].getBarcode()==barc){
                saldo=getSaldo()-distrC[i].getPrezzo();
            }
            if (distrC[i].getBarcode()==barc && distrC[i].getPrezzo()>getSaldo()){
                System.out.println("Oh poveracciooo!");
            }
        }
    }


    @Override
    public String toString() {
        return "DistributoreDiBevande{" +
                "distrC=" + Arrays.toString(distrC) +
                ", distrCp=" + Arrays.toString(distrCp) +
                ", num=" + num +
                ", saldo=" + saldo +
                '}';
    }
}
