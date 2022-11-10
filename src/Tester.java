import java.util.Scanner;

public class Tester {
    public static void main(String[]args){
        Scanner dataInput = new Scanner(System.in);

        System.out.println("Insert floor number");
        int floor = dataInput.nextInt();
        dataInput.nextLine();

        System.out.println("Insert address");
        String address = dataInput.nextLine();

        System.out.println("insert name");

        String residentNames = dataInput.nextLine();
        if(!residentNames.contains(",")){
            System.out.println("error");

        }
        System.out.println("floor : " + floor + " - address: " + address + " - name: " + residentNames);

    }


    }


