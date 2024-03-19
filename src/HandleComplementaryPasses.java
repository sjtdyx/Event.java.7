import java.util.Scanner;
import java.util.Stack;
import java.util.*;

public class HandleComplementaryPasses {

    Scanner reader=new Scanner(System.in);
    Stack<ComplementaryPasses> comPassess=new Stack<>();

    public void handleComplementaryPasses(){
        int choice=0;
        do{
            System.out.println("\n"+"here are the complementary passes operations avariable to you:"+"\n");
            System.out.println("type 1 to redeem complementary passes:"+"\n");
            System.out.println("type 2 to diaplay the list of redeemed complementary passes:"+"\n");
            System.out.println("type 3 to display the last redeemed complementary pass:"+"\n");
            System.out.println("type 4 to undo any of the redeemed complementary pass:"+"\n");
            System.out.println("type 5 to QUIT:"+"\n");
            choice=reader.nextInt();
            reader.nextLine();
            switch(choice)
            {
                case 1:
                System.out.println("how many complementary passes would you want to redeem:");
                int num=reader.nextInt();
                reader.nextLine();
                redeemedComplementaryPasses(num);
                break;
                case 2:
                displayComplementaryPasses();
                break;
                case 3:
                displayLastRedeemedComplementaryPass();
                break;
                case 4:
                undoRedeemedComplemnetaryPass();
                break;
                case 5:
                break;
                default:
                System.out.println("“Invalid operation. All the passes have been redeemed.");

            
            }

        }while(choice!=5);
        
    }
    public void redeemedComplementaryPasses(int numOfPasses){
        if(comPassess.size()>=10){
            System.out.println("\n"+"Invalid operation.All the complementary passes have already been redeemed.");
            System.out.println("\n"+"Would you like to see the list of redeemed complementary passes?(Y/N)");
            char choice=reader.nextLine().charAt(0);
            if(choice=='Y'){
                displayComplementaryPasses();
                return;
            }

        }else{
            int i=0;
            do{
                System.out.println("enter the Complementary Pass ID:");
                String ID=reader.nextLine();

                System.out.println("enter the access level:");
                String accessLevel=reader.nextLine();

                ComplementaryPasses pass=new ComplementaryPasses(ID,accessLevel);
                comPassess.push(pass);
                i++;
              }while(i<numOfPasses);
        }
    }
    public void displayComplementaryPasses(){
        System.out.println("here is the list of redeemed complementary passes:"+"\n"+comPassess);
    }
    public void displayLastRedeemedComplementaryPass(){
        System.out.println("the last redeemed complementary pass is:"+comPassess.peek());
    }
    public void undoRedeemedComplemnetaryPass(){
        System.out.println("enter the passID you wnat to undo:");
        String ID=reader.nextLine();

        for(ComplementaryPasses pass:comPassess){
            if(pass.getPassID().equals(ID)){
                comPassess.pop();
                System.out.println("the pass with the ID"+ID+"has been removed from the redeemed list.");
            }
        }

        
    }
    
}
