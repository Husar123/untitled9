/**
 * Created by Monia on 11.04.2017.
 */
public class Female extends Person {
    public static final Female DEFAULT= new Female() {
        @Override
        public Female getMother() {
            return Female.DEFAULT;
        }

        @Override
        public Male getFather() {
            return Male.DEFAULT;
        }
    };

    public Female(String name, Male father, Female mother) {
        super(name, father, mother);


    }
    public Female(String name){
        this.name=name;
        this.mother = Female.DEFAULT;
    }
    private Female(){
        super("Невідомий");
    }
}
