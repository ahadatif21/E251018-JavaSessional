class Person {
    public void displayInfo() {
        System.out.println("I am a person — the foundation of all professions.");
    }
}

class Doctor extends Person {
    public void treat() {
        System.out.println("As a Doctor, I diagnose illnesses and save lives at Chittagong Medical College Hospital.");
    }
}

class Teacher extends Person {
    public void teach() {
        System.out.println("As a Teacher, I inspire future engineers at IIUC's CCE department.");
    }
}

class Engineer extends Person {
    public void design() {
        System.out.println("As an Engineer, I design smart systems using Java & embedded hardware.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {

        System.out.println("HIERARCHICAL INHERITANCE");
        System.out.println("___________________________");

        Person general = new Person();
        general.displayInfo();

        System.out.println("\nDoctor:");
        Doctor dr = new Doctor();
        dr.treat();

        System.out.println("\nTeacher:");
        Teacher prof = new Teacher();
        prof.teach();

        System.out.println("\nEngineer:");
        Engineer eng = new Engineer();
        eng.design();
    }
}
