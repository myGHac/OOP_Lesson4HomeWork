package task2;

import java.util.Scanner;

public class Main {
   public static void main(String[] args){

       System.out.println("Укажите вариант документа: ");
       System.out.println("1 - XML, 2 - TXT, 3 - DOC");

       Scanner sc= new Scanner(System.in);
       int access = sc.nextInt();

       switch (access) {
           case 1:
               AbstractHandler xmlHandler = new XMLHandler();
               xmlHandler.create();
               xmlHandler.open();
                xmlHandler.change();
                xmlHandler.save();
                break;
           case 2:
               AbstractHandler txtHandler =new TXTHandler();
               txtHandler.create();
               txtHandler.open();
               txtHandler.change();
               txtHandler.save();
               break;
           case 3:
               AbstractHandler docHandler = new DOCHandler();
               docHandler.create();
               docHandler.open();
               docHandler.change();
               docHandler.save();
               break;
       }
   }
}
