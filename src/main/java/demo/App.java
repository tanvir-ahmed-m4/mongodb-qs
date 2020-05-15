package demo;

import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;

/**
 * Hello MongoDB!
 *
 */
public class App 
{
    public static void main( final String[] args) {
        System.out.println("Hello MongoDB!");
        final MongoClient mongoClient = MongoClients.create(args[0]);

        System.out.println("Databases: ");
        // mongoClient.listDatabases().forEach(d -> System.out.println(d.toJson()));
        mongoClient.listDatabases().iterator().forEachRemaining(System.out::println);

        System.out.println("Goodbye!");
        mongoClient.close();
    }
}
