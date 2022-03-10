import java.util.Arrays;

public class DistributoreDiBevande {


    private Bevande[] distrCp = new Bevande[5];
    private int num;
    private double saldo;
    private int count;

    public DistributoreDiBevande(int num){
        /*distrC = new Bevande[num];
        distrCp = new Bevande[num];
        for (int i = 0; i < num; i++) {
            distrC[i] = new Caffe();
            distrCp[i] = new Cappuccino();

        }*/
        Bevande[] distrC = new Bevande[num];
        for (int i = 0; i < num; i++) {
            distrCp[i]=distrC[i];
        }

        this.num= num;
    }
    public void caricaProdotto(Bevande bevande){

        distrCp[count]= bevande;

        count++;

    }

    public double getSaldo() {
        return saldo;
    }
    public double saldoAttuale() {
        return saldo;
    }

    public void inserisciImporto(double soldi){
        saldo = getSaldo()+soldi;
    }

    public boolean scegliProdotto(String barc){
        for (int i = 0; i <num ; i++) {
            if (distrCp[i].getBarcode()==barc){
                saldo=getSaldo()-distrCp[i].getPrezzo();
            }
            if (distrCp[i].getBarcode()==barc && distrCp[i].getPrezzo()>getSaldo()){
                System.out.println("Oh poveracciooo!");
            }
        }
        return false;
    }

    public double getResto() {
        return  getSaldo();

    }


    @Override
    public String toString() {
        return "DistributoreDiBevande{" +
                "distrCp=" + Arrays.toString(distrCp) +
                ", num=" + num +
                ", saldo=" + saldo +
                ", count=" + count +
                '}';
    }
}
