import java.util.Random;

public class Jogo {
    
    public static void main(String[] args) throws Exception {

        var player = new Personagem();
        player.nome = "Player1";

        while(true){
            var gerador = new Random();
            var acaoDoCacador = gerador.nextInt(3); //o gerador.nextInt piso é igual a zero e o teto e o valor especificado - 1
            
            switch (acaoDoCacador) {
                case 0:
                player.cacar();
                break;
                
                case 1:
                player.comer();
                break;
                
                case 2:
                player.dormir();
                break;
                
                
                default:
                System.out.println("Opcao invalida");
                break;
            }
            player.morrer();
            System.out.println(player); 
            System.out.println("******************************"); 
            Thread.sleep(1000);
        }
    }

   
    
}
