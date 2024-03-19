import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class HandlePerformance {
    Queue<Performance>performance=new LinkedList<>();
    Scanner reader=new Scanner(System.in);

 public void handlePerformance(){
    int option;
    do{
        System.out.println("enter the option to handle performance");
        System.out.println("Option 1:add performance");
        System.out.println("Option 2:Display all the performances");
        System.out.println("Option 3:Start the performances");
        System.out.println("Qption4:QUIT");
        option=reader.nextInt();
        reader.nextLine();
        switch(option){
            case 1:
            System.out.println("how many performance would you want to add");
            int num=reader.nextInt();
            reader.nextLine();
            for(int i=0;i<num;i++){
                System.out.println("enter the Id of the performance");
                String newPerformanceID=reader.nextLine();
                System.out.println("enter the new name of the performance");
                String newPerformanceName=reader.nextLine();
                System.out.println("enter the new leadName of the performance");
                String newPerformanceLeadName=reader.nextLine();
                Performance performance=new Performance(newPerformanceID,newPerformanceName,newPerformanceLeadName);                addPerformance(newPerformanceID,newPerformanceName,newPerformanceLeadName);
                this.performance.offer(performance);
                addPerformance(newPerformanceID,newPerformanceName,newPerformanceLeadName);
                }
            break;
            case 2:
            displayPerformance();
            break;
            case 3:
            startPerformance();
            break;
            case 4:
            break;
            default:
            System.out.println("Invalid option.please enter a valid option");}
        }while(option!=4);            
           
        }
        public void addPerformance(String performanceID,String performanceName,String performanceLeadName){
            Performance performance=new Performance(performanceID,performanceName,performanceLeadName);
            this.performance.offer(performance);
        }
        public void displayPerformance(){
            System.out.println("All performance"+performance.toString());
        }
        public void startPerformance(){
            System.out.println("the first performance "+performance.poll());
        }

    }
   
    
