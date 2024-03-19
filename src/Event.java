import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.*;

public class Event {
    //final Capacity=200;
    HashMap<String,Attendee>seatDetails=new HashMap<>(200,0.6f);
    private String eventID;
    private String eventName;
    private String eventVenue;
    private LocalDate eventDate;
    
    ArrayList<Attendee>eventAttendees=new ArrayList<>();
    
public Event(){
}

    public Event(String eventID,String eventName,String eventVenue,LocalDate eventDate,String seatNumber){
        this .eventID=eventID;
        this. eventName=eventName;
        this.eventVenue=eventVenue;
        this.eventDate=eventDate;
        
        this.eventAttendees=new ArrayList<>();

    }


    public String getEventID() {
        return eventID;
    }


    public void setEventID(String eventID) {
        this.eventID = eventID;
    }


    public String getEventName() {
        return eventName;
    }


    public void setEventName(String eventName) {
        this.eventName = eventName;
    }


    public String getEventVenue() {
        return eventVenue;
    }


    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }


    public LocalDate getEventDate() {
        return eventDate;
    }


    public void setEventDate(LocalDate eventDte) {
        this.eventDate = eventDte;
    }
    public void setSeatDetails(String seat,Attendee attendee){
       seatDetails.put(seat,attendee);  
    }
    public void  getSeatDetails(String seat){
        System.out.println("the details for the saet"+seat+"are as follows:"+"\n"+seatDetails.get(seat));
    }
    
    //public String getSeatDetails(){
       // return seatDetails;
    //}
    //public void setSeatDetails(){
       // this.seatDetails=seatDetails;
    //}

    public void organizeEvent(int choice){
        Scanner reader=new Scanner(System.in);

        switch(choice){
            case 1:
            System.out.println("enter the EventID");
            String id=reader.nextLine();
            setEventID(id);

            System.out.println("enter the name of the event");
            String eventName=reader.nextLine();
            setEventName(eventName);

            System.out.println("enter the venue of the event");
            String Venue=reader.nextLine();
            setEventVenue(Venue);

            System.out.println("enter the Event Date(YYYY-MM-DD)");
            LocalDate date=LocalDate.parse(reader.nextLine());
            setEventDate(date);
          case 2:
          System.out.println("how many attendees are coming");
          int num=reader.nextInt();
          reader.nextLine();
          
          for(int i=0;i<num;i++){
            System.out.println("enter the name of the attendee");
            String name=reader.nextLine();

            System.out.println("enter the gender of the attendee");
          char gender=reader.nextLine().charAt(0);

          System.out.println("enter the age of the attendee");
          int age =reader.nextInt();
          reader.nextLine();//it is necessary to write this for the Int

          System.out.println("enter the seatNumber of the attendee:");
          String seatNo=reader.nextLine();
          Attendee newAttendee=new Attendee(name,gender,age,seatNo);

          eventAttendees.add(new Attendee(name,gender,age,seatNo)); 
          setSeatDetails(seatNo,newAttendee);  
                                 }

          System.out.println("\n"+"all the attendee were added successfully yto the list");
          break;
          case 3:
          System.out.println("enter the anme of the attendee to remove: ");
          String nameToRemove=reader.nextLine();

          for(Attendee attendee:eventAttendees){
            if(nameToRemove.equals(attendee.getName())){
                eventAttendees.remove(attendee);
                break;
            }

          }System.out.println("\n"+"nameToRemove"+"removed successfully from the list");
          break;
          case 4:
          System.out.println("enter the name of the attendee you want to update");
          String nameToUpdate=reader.nextLine();

          for(Attendee attendee:eventAttendees){
            if(nameToUpdate.equals(attendee.getName())){
                System.out.println("enter the new name,or enter null if you don't want to update");
                String newName=reader.nextLine();
                if(!newName.equals("null")){
                    attendee.setName(newName);
                }

                System.out.println("enter the new age,or enter 0 if you don't want to update ");
                int newAge=reader.nextInt();
                reader.nextLine();
                if(newAge!=0){
                    attendee.setAge(newAge);
                }
            }
        }
            case 5:
            System.out.println("enter the name of the attendee to find");
            String nameToFind=reader.nextLine();
            for(Attendee attendee:eventAttendees){
                System.out.println(attendee);
                if(attendee.getName().equals(nameToFind)){
                    System.out.println(attendee);
                }
            }
          case 6:
          System.out.println("here is the list of the attendees"+"\n"+eventAttendees);  
          break;
          case 7:
          HandleComplementaryPasses compPass=new HandleComplementaryPasses();
          compPass.handleComplementaryPasses();
          break;
          case 8:
          HandlePerformance performance=new HandlePerformance();
          performance.handlePerformance();
          break;
          case 9:
          System.out.println("enter the seat number to find the details ");
          String seat=reader.nextLine();
          getSeatDetails(seat);
          break;
          case 10:
          break;
          default:
          System.out.println("Invalid choice");        
                }
                reader.close();
            
          }
        }


