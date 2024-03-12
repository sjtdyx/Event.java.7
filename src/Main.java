import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Event event= new Event(null,null,null,null);

        int choice=0;
        do{
            System.out.println("\n"+"here is what you cna do in the program"+"\n");
            System.out.println("Type 1to enter event details"+"\n");
            System.out.println("type 2 to enter attendeenames that come to the event"+"\n");
            System.out.println("type 3 to remove attendee from the list"+"\n");
            System.out.println("type 4to update an attendee from the list"+"\n");
            System.out.println("type5 to serach for an attendee in the list"+"\n");
            System.out.println("type 6 to display all the attendee from the event"+"\n");
            choice=scanner.nextInt();
            event.organizeEvent(choice);
        }while(choice!=7);
        scanner.close();
    }
}
