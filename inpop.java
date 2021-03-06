import java.util.Scanner;

class inpop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first name");
        String first = sc.nextLine();
        System.out.println("enter your last name");
        String last = sc.nextLine();
        System.out.println(first + " " + last);
    }
}