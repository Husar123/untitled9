/**
 * Created by Monia on 11.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        SampleFamilyProvider resolt = new SampleFamilyProvider();
        resolt.makeFamilyTree();
        System.out.println( resolt.makeFamilyTree().getMother().getFather().getName());
    }
}
