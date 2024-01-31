package employees;
class employees {
    private String name;
    private String address;
    private double salary;
    private String job_title;
//prob 53
    public employees(String name, String address, double salary, String job_title) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.job_title = job_title;
    }

    // get and set data

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getjob_title() {
        return job_title;
    }

    public void setjob_title(String job_title) {
        this.job_title = job_title;
    }

    // Method to calculate bonus 
    public double calculateBonus() {
        return salary * 0.1; // 10% of the salary as a bonus by default
    }

    // Method to generate performance report 
    public void generatePerformanceReport() {
        System.out.println("Generating performance report for " + name);
        
    }
}

class Manager extends employees {
    private String performance_report;

    public Manager(String name, String address, double salary, String job_title, String performance_report) {
        super(name, address, salary, job_title);
        this.performance_report = performance_report;
    }

    // Getting manager info

    public String performance_report() {
        return performance_report;
    }

    public void setDepartment(String performance_report) {
        this.performance_report = performance_report;
    }

    // Managers get a higher bonus
    public double calculateBonus() {
        return getSalary() * 0.15; 
    }

    
    public void generatePerformanceReport() {
        System.out.println("Generating performance report for Manager " + getName() + " : " + performance_report);
        // Implementation specific to Manager
    }

    // Additional methods for managing projects
    public void manageProjects() {
        System.out.println("Manager " + getName() + " is managing projects.");
    }
}

class Developer extends employees {
    private String programmingLanguage;
private String performance_report;
    public Developer(String name, String address, double salary, String job_title, String programmingLanguage, String performance_report) {
        super(name, address, salary, job_title);
        this.programmingLanguage = programmingLanguage;
        this.performance_report = performance_report;
    }

    // Getting Programmer info

    public String performance_report() {
        return performance_report;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    
    public double calculateBonus() {
        return getSalary() * 0.12; 
    }

    
    public void generatePerformanceReport() {
        System.out.println("Generating performance report for Developer " + getName() + " : " + performance_report);
    
    }

    // Additional methods for development tasks
    public void performCoding() {
        System.out.println("Developer " + getName() + " is coding in " + programmingLanguage);
    }
}

class Programmer extends Developer {
    public Programmer(String name, String address, double salary, String programmingLanguage, String performance_report) {
        super(name, address, salary, "Programmer", programmingLanguage,performance_report);
    }

    

    //programmer and devs have the same bonus
    public double calculateBonus() {
        return getSalary() * 0.12; 
    }

    
    public void generatePerformanceReport() {
        System.out.println("Generating performance report for Programmer " + getName() + " : " + performance_report());
        // Implementation specific to Programmer
    }

   
    public void debugCode() {
        System.out.println("Programmer " + getName() + " is debugging code.");
    }
}



