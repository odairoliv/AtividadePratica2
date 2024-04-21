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
                    editarItem();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
                    break;
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n----- Menu -----");
        System.out.println("1. Cadastrar Camisa");
        System.out.println("2. Cadastrar Calça");
        System.out.println("3. Cadastrar Acessório");
        System.out.println("4. Exibir Lista de Roupas");
        System.out.println("5. Excluir Roupa por ID");
        System.out.println("6. Excluir Todos os Itens");
        System.out.println("7. Editar Item");
        System.out.println("0. Sair do Sistema");
        System.out.println("-----------------\n");
    }

    private static void cadastrarCamisa() {
        System.out.println("\nCADASTRO DE CAMISA:");
        Vesturario camisa = cadastrarItemComum("Camisa");

        System.out.print("Informe o tipo de manga: ");
        String manga = Console.scanSting();
        ((Camisa) camisa).setManga(manga);

        GuardaRoupa.cadastrar(camisa);
        System.out.println("Camisa cadastrada com sucesso!");
    }

    private static void cadastrarCalca() {
        System.out.println("\nCADASTRO DE CALÇA:");
        Vesturario calca = cadastrarItemComum("Calça");

        System.out.print("Informe o corte: ");
        String corte = Console.scanSting();
        ((Calca) calca).setCorte(corte);

        GuardaRoupa.cadastrar(calca);
        System.out.println("Calça cadastrada com sucesso!");
    }

    private static void cadastrarAcessorio() {
        System.out.println("\nCADASTRO DE ACESSÓRIO:");
        Vesturario acessorio = cadastrarItemComum("Acessório");

        System.out.print("Informe o material: ");
        String material = Console.scanSting();
        ((Acessorio) acessorio).setMaterial(material);

        GuardaRoupa.cadastrar(acessorio);
        System.out.println("Acessório cadastrado com sucesso!");
    }

    private static Vesturario cadastrarItemComum(String tipo) {
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

        switch (tipo) {
            case "Camisa":
                return new Camisa(id, "Camisa", marca, cor, tamanho, ano, "");
            case "Calça":
                return new Calca(id, "Calça", marca, cor, tamanho, ano, "");
            case "Acessório":
                return new Acessorio(id, "Acessório", marca, cor, tamanho, ano, "");
            default:
                System.out.println("Tipo de item inválido.");
                return null;
        }
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

    private static void editarItem() {
        System.out.println("\nEDITAR ITEM:");
        System.out.print("Informe o ID do item a ser editado: ");
        int id = Console.scanInt();
    
        Vesturario itemExistente = GuardaRoupa.buscarPorId(id);
        if (itemExistente != null) {
            System.out.println("Item encontrado:");
            System.out.println(itemExistente);
            System.out.println("\nEDITAR DADOS:");

            Vesturario itemEditado = cadastrarItemComum(itemExistente.getTipo());
            itemEditado.setId(id);
    
            switch (itemEditado.getTipo()) {
                case "Camisa":
                    System.out.print("Informe o tipo de manga: ");
                    String manga = Console.scanSting();
                    ((Camisa) itemEditado).setManga(manga);
                    break;
                case "Calça":
                    System.out.print("Informe o corte: ");
                    String corte = Console.scanSting();
                    ((Calca) itemEditado).setCorte(corte);
                    break;
                case "Acessório":
                    System.out.print("Informe o material: ");
                    String material = Console.scanSting();
                    ((Acessorio) itemEditado).setMaterial(material);
                    break;
                default:
                    System.out.println("Tipo de item inválido.");
                    return;
            }
    
            if (GuardaRoupa.editarItem(itemEditado)) {
                System.out.println("Item editado com sucesso.");
            } else {
                System.out.println("Falha ao editar o item.");
            }
        } else {
            System.out.println("Item não encontrado.");
        }
    }
    
}
