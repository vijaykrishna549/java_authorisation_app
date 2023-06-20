package authentication_application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthData {

        private String fullName;
        private String email;
        private String password;


        public AuthData(String fullName, String email, String password) {
            this.fullName = fullName;
            this.email = email;
            this.password = password;
        }

        public AuthData() {

        }

        public int displayOption() {
            Scanner sc = new Scanner(System.in);
            System.err.println("1. Register");
            System.err.println("2. Login");
            System.err.println("3. Exit");
            System.err.println("Enter your choice");
            int operation = sc.nextInt();
            return operation;
        }

        List<String> UserDataBase = new ArrayList<>();

        public List<String> register() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your full name");
            String fullName = sc.nextLine();
            UserDataBase.add(fullName);

            System.out.println("Enter your email");
            String email = sc.next();
            UserDataBase.add(email);

            System.out.println("Enter your password");
            String password = sc.next();
            UserDataBase.add(password);

            System.out.println(UserDataBase + " adb");

            return UserDataBase;

        }
        public void login() {
//            AuthData csr = new AuthData();
//            System.out.println("get full details");
            System.out.println(UserDataBase + "Address Book");
            Scanner sc = new Scanner(System.in);


//            UserDataBase.add(fullName);

            System.out.println("Enter your email");
            String authEmail = sc.next();
            if(UserDataBase.contains(authEmail)){
                System.out.println("Enter your password");
                String authPassword = sc.next();
                if (UserDataBase.contains(authPassword)){
                    System.out.println("Login Success");
                }
                else {
                    System.err.println("Login Failed : Wrong password");
                }

            }
            else {
                System.err.println("Login failed : Wrong email");
            }

//            UserDataBase.add(email);


//            UserDataBase.add(password);



        }




    }


