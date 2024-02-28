import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку состоящую из <>- :");
        String input = in.nextLine();
        int sum = 0;
        for(int i = 0; i < input.length(); i++ ){
            char n = input.charAt(i);
            if(n == '<'){
                if(input.charAt(i + 1) == '-') sum++;
            }
            if(n == '>'){
                if(input.charAt(i - 1) == '-') sum++;
            }
        }
        System.out.println("Количестов стрелок: "+ sum);
    }
}