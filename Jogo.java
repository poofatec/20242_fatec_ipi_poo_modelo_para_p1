import java.util.Random;

public class Jogo {

    public static void main(String[] args) throws Exception {

        var player = new Personagem();
        player.nome = "Player1";
        var preguica = new Personagem(2, 10, 10);
        preguica.nome = "Ze Preguica";
        var gerador = new Random();

        while (true) {
            if (!player.isMorto()) {
                var acaoDoCacador = gerador.nextInt(3); // o gerador.nextInt piso é igual a zero e o teto e o valor
                // especificado - 1
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

                }
                System.out.println(player);
                System.out.println("******************************");
            }

            if (!preguica.isMorto()) {
                var acaoDoPreguica = gerador.nextInt(100) + 1;
                if (acaoDoPreguica <= 10) {
                    preguica.cacar();
                } else if (acaoDoPreguica <= 40) {
                    preguica.comer();
                } else {
                    preguica.dormir();
                }
                System.out.println(preguica);
                System.out.println("******************************");
            }

            boolean playerMorto = player.isMorto() || player.morrer();
            boolean preguicaMorto = preguica.isMorto() || preguica.morrer();
            if (playerMorto && preguicaMorto) {
                System.out.println("Game Over! Ambos os personagens morreram.");
                break;
            }

            Thread.sleep(5000);
        }
    }
}