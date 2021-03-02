package producer;

import java.util.Properties;
import org.apache.kafka.clients.producer.*;

public class ProducerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props= new Properties();
		props.put("bootstrap.servers", "localhost:9092");
//		props.put("key.serializer", "org.apache.kafka.common.serialization.IntegerSerializer");
//		props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		
		Producer<Integer, String> producer= new KafkaProducer<Integer, String>(props);
		
		for(int i=0; i<10; i++) {
			ProducerRecord<Integer, String> proRecord= new ProducerRecord<Integer, String>("kafkAUAssignment",i,"Command Message "+Integer.toString(i));
			producer.send(proRecord);
		}
		
		producer.close();
	}

}
