public class Main {
    public static void main(String[] args) {
        Articolo article1 = new Articolo("Pizza Napoli", 3.99);
        //article1.nome = "Pizza Napoli"; questi vengono tutti cancellati
        //article1.prezzo = 3.99; " qui ora posso cambiare prezzo
                                  //e verrà stampato prezzo nuovo
        Articolo article2 = new Articolo("Coca cola", 0.99);
        //article2.nome = "Coca cola"; "
        //article2.prezzo = 0.99; "

        System.out.println("Articolo 1: " + article1); //questi non servono più ora che abbiamo la stampa giù
        System.out.println("Articolo 2: " + article2);

        Carrello carrello = new Carrello(new Articolo[]{article1, article2});
        //carrello.articoli = new Articolo[]{article1, article2};
        //carrello.prezzoFinale = article1.getPrezzo() + article2.getPrezzo(); //cambiato da prezzo, questo permette
        // di non poter più cambiare il prezzo
        System.out.println("Carrello: " + carrello);

        Articolo article3 = new Articolo("Tiramisu", 2.49);
        carrello = new Carrello(new Articolo[]{article1, article2, article3});

        System.out.println("Carrello aggiornato: " + carrello);
    }
}