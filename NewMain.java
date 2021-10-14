package exe2printing;
public class NewMain {
    public static void main(String[] args) {
        Account daniel = new Account(60288,100,1.5);
        Account ros = new Account(62386,600,1.5);
        System.out.println("Version 1");
        System.out.println(daniel.getId()+", you have RM"+daniel.getBalance()+"!");
        System.out.println(ros.getId()+", you have RM"+ros.getBalance()+"!");
        System.out.println("Version 2");
        printing(daniel);
        printing(ros);
        System.out.println("Version 3");
        daniel.printing();
        ros.printing();
        System.out.println("Version 4");
        System.out.print(daniel);
        System.out.print(ros.toString());
    }
    public static void printing (Account x){   //version 2
        System.out.println(x.getId()+", you have RM"+x.getBalance()+"!");
    }
}
