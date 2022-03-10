import java.util.Arrays;

public class DistributoreDiBevande {

    private Bevande[] distrC;
    private Bevande[] distrCp;

    public DistributoreDiBevande(int num){
        distrC = new Bevande[num];
        distrCp = new Bevande[num];
        for (int i = 0; i < num; i++) {
            distrC[i] = new Caffe();
            distrCp[i] = new Cappuccino();

        }
    }

    @Override
    public String toString() {
        return "DistributoreDiBevande{" +

                ", distrC=" + Arrays.toString(distrC) +
                ", distrCp=" + Arrays.toString(distrCp) +
                '}';
    }
}
