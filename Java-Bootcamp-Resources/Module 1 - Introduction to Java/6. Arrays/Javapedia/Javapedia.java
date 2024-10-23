import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int records= scan.nextInt();
        scan.nextLine();
        String[][] figures= new String[records][3];         
        for (int i=0;i<figures.length;i++) {

            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            figures[i][0]=scan.nextLine();
              

            System.out.print("\t - Date of birth: ");
            figures[i][1]=scan.nextLine();
            //scan.nextLine();  

            System.out.print("\t - Occupation: ");
            figures[i][2]=scan.nextLine();
            //5scan.nextLine();  

            System.out.print("\n");

        }
        
        System.out.println("These are the values you stored:"); 
        print2DArray(figures);

        System.out.print("\nWho do you want information on? ");  
        String input=scan.nextLine();
        int i;
        for( i=0; i<figures.length;i++){
            if (figures[i][0].equalsIgnoreCase(input)){
System.out.println("\t Name: "+figures[i][0]);
System.out.println("\t Date of birth: "+figures[i][1]);
System.out.println("\t Occupation: "+figures[i][2]);
           break; }
        }
        if (i==figures.length) {
            System.out.println("The record for "+input+" doesn't exist");
        }
        
       
        scan.close();
    }

 
static void print2DArray(String[][]input){
for (int i=0; i<input.length;i++){
    for (int j=0; j<input[i].length;j++){
        System.out.print("\t"+input[i][j]+" ");
        
    }
    System.out.println("\n");
}
}
}
