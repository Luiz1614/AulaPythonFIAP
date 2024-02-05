import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Carta> cartas = new ArrayList<Carta>(List.of(
                new Carta("Ilha", "Terreno", "Comum", 0.1),
                new Carta("Pantano", "Terreno", "Comum", 0.1),
                new Carta("Extorsionista das Docas", "Criatura", "Mitica", 350),
                new Carta("Ilha nevada", "Terreno", "Comum", 9.0),
                new Carta("Anel Solar", "Artefato", "Incomum", 5.0)
        ));

        while (true) {
            System.out.println("Bem vindo ao sistema de cadastro de cartas de Magic: the Gathering, \r\n " +
                    "digite a opção desejada:\r\n" +
                    "============================ \r\n"+
                    "1. Cadastrar carta\r\n" +
                    "2. Remover carta\r\n" +
                    "3. Calcular preco médio\r\n"+
                    "4. Mostrar coleção ordernada pelo nome\r\n" +
                    "0. Sair");

            var scanner = new Scanner(System.in);
            var opcao = scanner.nextInt();
            scanner.nextLine();

            if(opcao == 0) break;
            else if (opcao == 1) {
                //Criar uma nova carta
                var novaCarta = new Carta();

                //Cadastrar a carta
                System.out.println("Digite o nome da carta: ");
                novaCarta.setNome(scanner.nextLine());

                System.out.println("Digite o tipo da carta: ");
                novaCarta.setTipo(scanner.nextLine());

                System.out.println("Digite o Raridade da carta: ");
                novaCarta.setRaridade(scanner.nextLine());

                System.out.println("Digite o preco da carta: ");
                novaCarta.setPreco(scanner.nextDouble());
                scanner.nextLine();

                //Adicionar ela na lista de cartas
                cartas.add(novaCarta);
            }
            else if (opcao == 3) {
                System.out.printf("\r\nO valor médio das cartas é de: \r\n%s\r\n%n",
                        cartas.stream().mapToDouble(Carta::getPreco).average().orElse(0));
            }
            else if (opcao == 4) {
                Collections.sort(Collections.sort(cartas));
            }
        }

        System.out.println("Encerrando sistema;");
    }

    public void TestarManipulacaoDeListas(){
        //Declaração da nossa Lista;
        var cartas = Arrays.asList(
                new Carta("Black Lotus", "Artefato", "Mítica", 10000.0),
                new Carta("Lightning Bolt", "Feitiço Instantâneo", "Comum", 2.0),
                new Carta("Island", "Terra Básica", "Comum", 0.1),
                new Carta("Serra Angel", "Criatura", "Incomum", 1.5)
        );

        System.out.println("\r\nCartas Comuns:");
        //Filtro para retornar apenas as castas comuns (Tradicional)
        var cartasComuns = new ArrayList<Carta>();
        for (var carta:
                cartas) {
            if (carta.getRaridade().equalsIgnoreCase("comum"))
                cartasComuns.add(carta);
        }
        cartasComuns.forEach(System.out::println);


        //Filtro para retornar apenas as cartas comuns (StreamAPI)
        // Filtrar lista de cartas onde a carta tenha uma raridade igual sem considerar
        // case sensitive que seja igual a comum e para cada uma dessas cartas, imprima na tela
        cartas.stream()
                .filter(carta -> carta.getRaridade().equalsIgnoreCase("comum"))
                .toList()
                .forEach(System.out::println);

        System.out.println("\r\nCartas acima de $5:");

        //Filtro para retornar apenas as cartas acima de $5 onde para cada carta, imprima um
        // texto peronalizado contendo o nome e o preço
        cartas.stream()
                .filter(carta -> carta.getPreco() > 5.0)
                .forEach(carta -> System.out.println(carta.getNome() + ", preço: " + carta.getPreco()));

        System.out.println("\r\nCartas em maiusculo: ");
        //Imprimir todas as cartas maiusculas (Tradicional)
        for (var carta : cartas)
            System.out.println(carta.getNome().toUpperCase());

        //Imprimir todas as cartas maiusculas (StreamAPI)
        // 1 jeito - fazer o foreach direto
        cartas.forEach(carta -> System.out.println(carta.getNome().toUpperCase()));

        //2 jeito - usar map
        cartas.stream().map(carta -> carta.getNome().toUpperCase())
                .forEach(System.out::println);

        System.out.println("\r\nPreço médio das cartas: ");
        // Maneira tradicional
        var medio = 0.0;
        for (var carta : cartas) medio += carta.getPreco();
        System.out.println(medio/cartas.size());

        //Usando Stream API
        double mediaPreco = cartas.stream().mapToDouble(Carta::getPreco)
                .average().orElse(0.0);
        System.out.println(mediaPreco);
    }
}