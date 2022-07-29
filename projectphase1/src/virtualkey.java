import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.IOException;
public class virtualkey {
	File  name ;
    
// constructor to get the path of the file
    public virtualkey() {
     String directory= System.getProperty("user.dir");
        name = new File(directory+"/files");
        if (!name.exists())
            name.mkdirs();
        System.out.println("Directory : "+ name.getAbsolutePath());
    }

    private static final String developer =
            "\nProject name: LockedMe.com \nDeveloped By : Priyadarshini";
    private static final String mainmenu1=
            "\nMAIN MENU - choose following options to experience lockedMe.com : \n"+
                    "\n1:List files in directory"+
                    "\n2:Add,Search or Delete"+
                    "\n3:Exit Program";
    
    void Menu1() {
    	System.out.println(mainmenu1);
        try{
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose){
                case 1 : {
                    sorting();
                    Menu1();
                }
                case 2 : {
                    Menu2();
                }
                case 3 : {
                    System.out.println("Thank You For Using LockedMe");
                    System.exit(0);
                }
                default: Menu1();
            }
        }
        catch (Exception e){
            System.out.println("Please Enter Option 1, 2 or 3");
            Menu1();
        }
    }
    private static final String mainmenu2 =
            "   \nSelect any of the following Option: \n"+
                    " 4 -> Add a file\n"+
                    " 5 -> Search a file\n"+
                    " 6 -> Delete a file\n"+
                    " 7 -> Go Back menu1";

    void Menu2() {
        System.out.println(mainmenu2);
        try{
            Scanner sc = new Scanner(System.in);
            char[] input = sc.nextLine().toLowerCase().trim().toCharArray();
            int i = input[0];

            switch (i){
                case '4' : {
                    System.out.print("For Adding a file...Please Enter a File Name : ");
                    String filename = sc.next().toLowerCase();
                    addFile(filename);
                    break;
                }
                case '5' : {
                    System.out.print("For Searching a file...Please Enter a File Name : ");
                    String filename = sc.next();
                    searching(filename);
                    break;
                }

                case '6' : {
                    System.out.print("For Deleting a file...Please Enter a File Name : ");
                    String filename = sc.next();
                    deletion(filename);
                    break;
                }
                   case '7' : {
                    System.out.println("return to main menu");
                    Menu1();
                    break;
                }
                default : System.out.println("Please enter Otion 4, 5, 6 or 7");
            }
            Menu2();
        }
        catch (Exception e){
            System.out.println("Please enter Option 4, 5, 6 or 7");
            Menu2();
        }
    }
    void addFile(String filename) throws IOException {
        File filepath = new File(name +"/"+filename);
        String[] list = name.list();
        for (String file: list) {
            if (filename.equalsIgnoreCase(file)) {
                System.out.println("File " + filename + " is already exists at " + name);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+filename+"is added to "+ name+" Successfully");
    }

    void sorting() {
        if (name.list().length==0)
            System.out.println(" folder is empty");
        else {
            String[] list = name.list();
            System.out.println(" files in "+ name +" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }
    void searching(String filename) {
        String[] list = name.list();
        for (String file: list) {
            if (filename.equals(file)) {
                System.out.println("FOUND : File " + filename + " Exists at " + name);
                return;
            }
        }
        
        System.out.println("File NOT found");
    }

    

    void deletion(String filename) {
        File filepath = new File(name +"/"+filename);
        String[] list = name.list();
        for (String file: list) {
            if (filename.equals(file) && filepath.delete()) {
                System.out.println("File " + filename + " deleted from " + name);
                return;
            }
        }
        System.out.println("Delete Operation failed. FILE NOT FOUND");
    }

    

    public static void main(String[] args) {
        System.out.println(developer);
        virtualkey menu = new virtualkey();
        menu.Menu1();
    }
}