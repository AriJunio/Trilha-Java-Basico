import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args){
        try{
         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     
            System.out.println("Digite sua NOME" );
            String nome = scanner.next();
            
            System.out.println("Digite seu SOBRENOME");
            String sobrenome = scanner.next();   

            System.out.println("Digite sua IDADE");
            int idade = scanner.nextInt();
            
            System.out.println("Digite sua ALTURA");
            double altura = scanner.nextDouble();


     //imprimido os dados obtidos pelo usuario
            System.out.println("Ola,me chamo " + nome +" " + sobrenome);
            System.out.println("Tenho " + idade + " anos");
            System.out.println("Minha altura e " + altura + " cm ");
            }
            catch(InputMismatchException e){
                System.out.println("Os Campos IDADE e ALTURA presisam ser NUMERICO");
            }
        }

    
}
