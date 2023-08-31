package cliente;

import model.Cliente;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class Teste {

    private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("postgres");
    private static EntityManager entityManager = entityManagerFactory.createEntityManager();

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //INSERT
        /*Cliente cliente = new Cliente();
        System.out.println("Digite o nome do cliente a ser cadastrado:");
        cliente.setNome(scan.next());

        entityManager.getTransaction().begin();
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();*/

        //UPDATE
        Cliente cliente = new Cliente();
        System.out.println("Digite a ID do cliente a ser atualizado:");
        cliente.setId(scan.nextInt());
        System.out.println("Digite o novo nome do cliente:");
        cliente.setNome(scan.next());

        entityManager.getTransaction().begin();
        entityManager.merge(cliente);
        entityManager.getTransaction().commit();

        //DELETE - DICA
        entityManager.getTransaction().begin();
        entityManager.remove(cliente);
        entityManager.getTransaction().commit();

        //PESQUISAR - DICA
        Cliente cliente = entityManager.find(Cliente.class, 1);
        System.out.println("Nome do cliente:" + cliente.getNome());

    }
}
