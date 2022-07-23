import java.util.*;
public class wisestepabhishekmishra{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("No of vehicles avaliable");
        int x=sc.nextInt();
        System.out.println("There is "+x+" no of vehicles available and reservation will be valid for next "+x+ " minutes and the user has to pickup the vehicle before the reservation expires");
        System.out.println("User can drive for "+x+" kilometers and request for a near by drop off.");

       
           if(x>0){
                System.out.println("user can take ride");
                System.out.println("There is "+x+" no of vehicle/vehicles are available book it for next "+x+" minutes");
                System.out.println("for booking vehicle press 1");
                int book=sc.nextInt();
                if(book==1){
                    System.out.println("your ride is booked for next "+x+" minutes");
                    x--;
                }

           }else{
            System.out.println("You can't take ride Sorry for you.");
        }
    
        sc.close();
    }
}