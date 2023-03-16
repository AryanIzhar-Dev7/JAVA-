class Experimenter {

    String name;
    int age;

    Experimenter(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void print() {
        System.out.println("name : "+name);
        System.out.println("Age: "+age);

    }
}
public class Sunday {

        public static void main(String args[]) {

        Experimenter experiment= new Experimenter("Itachi",21);

        // calling print method;
            experiment.print();

            // updating the experiment Values
        update(experiment);

        // calling print method after updating the experiment
        experiment.print();
        }
        static void update(Experimenter experiment) {
            experiment.name="Aryan";
            experiment.age=22;
        }


}













