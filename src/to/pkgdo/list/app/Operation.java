package to.pkgdo.list.app;

import java.util.Scanner;

public class Operation {
    
    public static void task_deletion(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Delete a Task ===");
        System.out.print("Enter the task number you want to delete: ");
        int taskNum = sc.nextInt();
        
    }
    
    public static void task_sorting(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("""
                           === Sort Tasks ===
                           Sort by:
                           1. Due date (Ascending)
                           2. Due date (Descending)
                           3. Priority (Hoigh to Low)
                           4. Prioroty (Low to High)
                           """);
        
        System.out.print("> ");
        int taskNum = sc.nextInt();
        
    }
    
    public static void task_searching(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Search Tasks ===");
        System.out.print("Enter a keyword to search by title or description: ");
        String search = sc.nextLine();
        
    }
}
