package employees;

public class heirarchy {
    //prob 53
        public static void main(String[] args) {
            Manager manager = new Manager("Daniel Manager", "123 Main St", 80000, "Manager", "Good");
            Developer developer = new Developer("Steven Developer", "456 Oak St", 70000, "Developer", "Java","Good");
            Programmer programmer = new Programmer("Fidel Programmer", "789 Pine St", 75000, "Python","Good");
        
      
            System.out.println("Manager Bonus: Php" + manager.calculateBonus());
            manager.generatePerformanceReport();
            manager.manageProjects();
    
            System.out.println("\nDeveloper Bonus: Php" + developer.calculateBonus());
            developer.generatePerformanceReport();
            developer.performCoding();
    
            System.out.println("\nProgrammer Bonus: Php" + programmer.calculateBonus());
            programmer.generatePerformanceReport();
            programmer.debugCode();
        }
}
