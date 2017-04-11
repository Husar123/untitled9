/**
 * Created by Monia on 11.04.2017.
 */
public class Male extends Person {
        public static final Male DEFAULT = new Male() {
            @Override
            public Male getFather() {
                return Male.DEFAULT;
            }

            @Override
            public Female getMother() {
                return Female.DEFAULT;
            }
        };

        public Male(String name, Male father, Female mother) {
            super(name, father, mother);
        }

        public Male(String name) {
            this.name= name;
            this.father=Male.DEFAULT;
            this.mother=Female.DEFAULT;

        }
        private Male(){
            super("Невідомий");
        }
}
