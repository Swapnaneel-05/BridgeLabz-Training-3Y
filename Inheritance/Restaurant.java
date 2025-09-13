package BridgeLabz.OOPSJava.Inheritance;

interface Worker {
    void performDuties();
}

class Restaurant {
    String name;
    int id;

    public Restaurant(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Restaurant Name: " + name + ", ID: " + id);
    }
}

class Chef extends Restaurant implements Worker {
    String specialty;

    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking " + specialty + " dishes.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Chef, Specialty: " + specialty);
    }
}

class Waiter extends Restaurant implements Worker {
    int tableAssigned;

    public Waiter(String name, int id, int tableAssigned) {
        super(name, id);
        this.tableAssigned = tableAssigned;
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving table number " + tableAssigned + ".");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Role: Waiter, Table Assigned: " + tableAssigned);
    }
}
