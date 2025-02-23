import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome completo!");
        System.out.println("Aperte ENTER após digitar!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da sua Agência!");
        int agencia = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da sua Conta!");
        int conta = scanner.nextInt();
       

       
        double saldo;
        saldo = 1000;


        // Exibir as mensagens para os usuarios
     
        // Obter pela classe Scanner os valores digitados no terminal
        
        // Exibir a mensagem da conta criada
        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");



    }
}
