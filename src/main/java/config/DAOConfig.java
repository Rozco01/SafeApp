package config;

import static com.mongodb.client.model.Filters.eq;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class DAOConfig {
	public static void main( String[] args ) {

	    // Replace the uri string with your MongoDB deployment's connection string
	    String uri = "mongodb+srv://juan:12345@cluster0.ozxhb.mongodb.net/myFirstDatabase?retryWrites=true&w=majority";

	    try (MongoClient mongoClient = MongoClients.create(uri)) {
	        MongoDatabase database = mongoClient.getDatabase("db_pacientes");
	        MongoCollection<Document> collection = database.getCollection("pacientes");

	        Document doc = collection.find(eq("nombre", "Juan")).first();
	        System.out.println(doc.toJson());
	    }
	}
}


