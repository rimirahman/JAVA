//Create a program which will take input from users for registration and save the info to a json file.

import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistrationJson {
    public static void main(String[] args) throws IOException {
        JSONObject jsonobject = new JSONObject();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your email : ");
        String email = scanner.nextLine();

        System.out.println("Enter password : ");
        String password = scanner.nextLine();

        System.out.println("Enter address : ");
        String address = scanner.nextLine();

        System.out.println("Enter your mobile number : ");
        String mobileNumber = scanner.nextLine();

        jsonobject.put("name",name);
        jsonobject.put("email",email);
        jsonobject.put("password",password);
        jsonobject.put("address",address);
        jsonobject.put("mobile number",mobileNumber);


        System.out.println(jsonobject);

        FileWriter file = new FileWriter("./src/main/resources/User.json");
        file.write(jsonobject.toJSONString());
        file.flush();
        file.close();

    }
}
