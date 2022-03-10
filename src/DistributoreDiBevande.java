import java.util.Arrays;

public class DistributoreDiBevande {

    private Bevande[] distrC;
    private Bevande[] distrCp;
    private int num;

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





}
