package Grafos;

public class FillmesAtores {

    public static void main(String[] args) {
        // Contextualizando:
        // Como ideia para criar um Grafo, utilizei como base um jogo web chamado: Connect the Stars (https://connectthestars.xyz)
        // Nesse jogo, nós basicamente inserimos 2 nomes de atores, e nós precisamos de alguma forma ligá-los por meio de
        // outros atores ou filmes
        // Conforme você vai jogando e inserindo mais e mais atores/filmes, a estrutura vai se tornando um Grafo, onde atores
        // específicos se relacionam com filmes específicos e vice-versa
        // Dá uma jogadinha, é legal 😁

        // Eu vou criar do tipo String, já que serão nomes de filmes e atores
        Grafo<String> connectTheStars = new Grafo<String>();

        // Adicionando os filmes e atores
        connectTheStars.adicionarVertice("Hugh Jackman");
        connectTheStars.adicionarVertice("X-Men Origins Wolverine");
        connectTheStars.adicionarVertice("Ryan Reynolds");
        connectTheStars.adicionarVertice("The Adam Project");
        connectTheStars.adicionarVertice("Mark Ruffalo");
        connectTheStars.adicionarVertice("Eternal Sunshine of The Spotless Mind");
        connectTheStars.adicionarVertice("Jim Carrey");

        // O 'Hugh Jackman' fez o filme 'X-Men Origins Wolverine'
        connectTheStars.adicionarAresta(5.0, "Hugh Jackman", "X-Men Origins Wolverine");

        // Consequentemente, no filme 'X-Men Origins Wolverine', o 'Ryan Reynolds' atua
        connectTheStars.adicionarAresta(5.0, "X-Men Origins Wolverine", "Ryan Reynolds");

        // Consequentemente, o 'Ryan Reynolds' atua no filme 'The Adam Project'
        connectTheStars.adicionarAresta(5.0, "Ryan Reynolds", "The Adam Project");

        // Consequentemente, no filme 'The Adam Project', o 'Mark Ruffalo' atua
        connectTheStars.adicionarAresta(5.0, "The Adam Project", "Mark Ruffalo");

        // Consequentemente, o 'Mark Ruffalo' atua no filme 'Eternal Sunshine of The Spotless Mind'
        connectTheStars.adicionarAresta(5.0, "Mark Ruffalo", "Eternal Sunshine of The Spotless Mind");

        // Consequentemente, no filme 'Eternal Sunshine of The Spotless Mind', o 'Jim Carrey' atua
        connectTheStars.adicionarAresta(5.0, "Eternal Sunshine of The Spotless Mind", "Jim Carrey");

        connectTheStars.BuscaEmLargura();
    }

}
