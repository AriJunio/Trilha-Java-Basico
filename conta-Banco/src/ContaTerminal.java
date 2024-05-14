import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
      
       //TODO:Conhecer e importa a classe scanner
       
       Scanner input = new Scanner(System.in);
       int numero;
       String agencia = "";
       String nomeCliente = "";
       double saldo;
       
       //Exibir as mensagens para o usuário

       System.out.println("Qual o seu nome completo? ");
            nomeCliente = input.nextLine();
       System.out.println("Digite o número da agência: ");
            agencia = input.nextLine();
       System.out.println("Digite sua número da conta: ");
            numero = input.nextInt();

       
       //Obter pela scanner os valores digitados no terminal

        System.out.println("Digite o saldo: ");
        saldo = input.nextDouble();
       
       //Exibir a mensagem conta criada

        System.out.println("Olá " + nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua AGÊNCIA: " + agencia + ", CONTA: " + numero + " e seu SALDO: R$ " + saldo + " já está disponível para saque.");
    }
    }

