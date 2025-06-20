package se.lofmark;

import java.util.Scanner;

public class DataValidation {

    private Scanner in;

    DataValidation(){
        in = new Scanner(System.in);
    }
    public int readInteger(String promptMsg, String errorMsg){
        int num = 0;
        String strInput;
        boolean valid = false;

        while(valid == false){
            System.out.print(promptMsg);
            strInput = in.nextLine();

            try{
                num = Integer.parseInt(strInput);
                valid = true;
            }
            catch(NumberFormatException e){
                System.out.println(errorMsg);
            }
        }
        return num;
    }
    //Data validator for displayMenu
    public int readInteger(String promptMsg, String errorMsg, int low, int high){
        int num = 0;
        String strInput;
        boolean valid = false;

        while(valid == false){
            System.out.print(promptMsg);
            strInput = in.nextLine();

            try{
                num = Integer.parseInt(strInput);
                if(num >= low && num <= high)
                    valid = true;
                else System.out.println(errorMsg);
            }
            catch(NumberFormatException e){
                System.out.println(errorMsg);
            }
        }
        return num;
    }

    public double readDouble(String promptMsg, String errorMsg){
        double num = 0;
        String strInput;
        boolean valid = false;

        while(valid == false){
            System.out.print(promptMsg);
            strInput = in.nextLine();

            try{
                num = Double.parseDouble(strInput);
                valid = true;
            }
            catch(NumberFormatException e){
                System.out.println(errorMsg);
            }
        }
        return num;
    }
    public double readDouble(String promptMsg, String errorMsg, double low, double high){
        double num = 0;
        String strInput;
        boolean valid = false;

        while(valid == false){
            System.out.print(promptMsg);
            strInput = in.nextLine();

            try{
                num = Double.parseDouble(strInput);
                if(num >= low && num <= high)
                    valid = true;
                else System.out.println(errorMsg);
            }
            catch(NumberFormatException e){
                System.out.println(errorMsg);
            }
        }
        return num;
    }
}
