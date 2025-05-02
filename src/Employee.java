 class Employee {
    void work() {
        System.out.println("Employee is working");
    }
}

class Manager extends Employee {
    void attendMeeting() {
        System.out.println("Manager is attending a meeting");
    }
}

 class main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.work();           // Calling method from Employee class
        m.attendMeeting();  // Calling method from Manager class
    }
}
