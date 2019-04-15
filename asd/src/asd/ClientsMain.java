package asd;

/**
 *
 * @author ico
 */
public class ClientsMain {

    public static void main(String[] args) {
        ClientsPortfolio portfolio = new ClientsPortfolio();

        Client client1 = new Client("C101", "Logistica Tartaruga");
        portfolio.addClient(client1);

        Client client2 = new Client("C104", "Jose, Maria & Jesus Lda");
        portfolio.addClient(client2);

        System.out.println("Clients count: " + portfolio.countClients());
    }
}
