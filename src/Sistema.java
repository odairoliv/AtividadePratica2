public class Sistema {

    public static void iniciarSistema() {
        int opcao;
    
        do {
            exibirMenu();
            opcao = Console.scanInt();
    
            switch (opcao) {
                case 1:
                    cadastrarCamisa();
                    break;
                case 2:
                    cadastrarCalca();
                    break;
                case 3:
                    cadastrarAcessorio();
                    break;
                case 4:
                    exibirListaRoupas();
                    break;
                case 5:
                    excluirRoupaPorId();
                    break;
                case 6:
                    excluirTodosItens();
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
    
        } while (opcao != 7);
    }

    private static void exibirMenu() {
        System.out.println("\n----- Menu -----");
        System.out.println("1. Cadastrar Camisa");
        System.out.println("2. Cadastrar Calça");
        System.out.println("3. Cadastrar Acessório");
        System.out.println("4. Exibir Lista de Roupas");
        System.out.println("5. Excluir Roupa por ID");
        System.out.println("6. Excluir Todos os Itens");
        System.out.println("7. Sair do Sistema");
        System.out.println("-----------------\n");
    }

    private static void cadastrarCamisa() {
        System.out.println("\nCADASTRO DE CAMISA:");
        System.out.print("Informe o ID: ");
        int id = Console.scanInt();

        System.out.print("Informe a marca: ");
        String marca = Console.scanSting();

        System.out.print("Informe a cor: ");
        String cor = Console.scanSting();

        System.out.print("Informe o tamanho: ");
        String tamanho = Console.scanSting();

        System.out.print("Informe o ano: ");
        int ano = Console.scanInt();

        System.out.print("Informe o tipo de manga: ");
        String manga = Console.scanSting();

        GuardaRoupa.cadastrar(new Camisa(id, "Camisa", marca, cor, tamanho, ano, manga));
        System.out.println("Camisa cadastrada com sucesso!");
    }

    private static void cadastrarCalca() {
        System.out.println("\nCADASTRO DE CALÇA:");
        System.out.print("Informe o ID: ");
        int id = Console.scanInt();

        System.out.print("Informe a marca: ");
        String marca = Console.scanSting();

        System.out.print("Informe a cor: ");
        String cor = Console.scanSting();

        System.out.print("Informe o tamanho: ");
        String tamanho = Console.scanSting();

        System.out.print("Informe o ano: ");
        int ano = Console.scanInt();

        System.out.print("Informe o corte: ");
        String corte = Console.scanSting();

        GuardaRoupa.cadastrar(new Calca(id, "Calça", marca, cor, tamanho, ano, corte));
        System.out.println("Calça cadastrada com sucesso!");
    }

    private static void cadastrarAcessorio() {
        System.out.println("\nCADASTRO DE ACESSÓRIO:");
        System.out.print("Informe o ID: ");
        int id = Console.scanInt();

        System.out.print("Informe a marca: ");
        String marca = Console.scanSting();

        System.out.print("Informe a cor: ");
        String cor = Console.scanSting();

        System.out.print("Informe o tamanho: ");
        String tamanho = Console.scanSting();

        System.out.print("Informe o ano: ");
        int ano = Console.scanInt();

        System.out.print("Informe o material: ");
        String material = Console.scanSting();

        GuardaRoupa.cadastrar(new Acessorio(id, "Acessório", marca, cor, tamanho, ano, material));
        System.out.println("Acessório cadastrado com sucesso!");
    }

    private static void exibirListaRoupas() {
        System.out.println("\nROUPAS CADASTRADAS:");
        for (Vesturario tempRoupa : GuardaRoupa.getlistaRoupas()) {
            System.out.println(tempRoupa);
        }
    }

    private static void excluirRoupaPorId() {
        System.out.println("\nEXCLUIR ROUPA:");
        System.out.print("Informe o ID da roupa a ser excluída: ");
        int id = Console.scanInt();

        if (GuardaRoupa.excluir(id)) {
            System.out.println("Roupa excluída com sucesso.");
        } else {
            System.out.println("Roupa não encontrada ou não pode ser excluída.");
        }
    }

    private static void excluirTodosItens() {
        GuardaRoupa.excluirTodos();
    }
}
