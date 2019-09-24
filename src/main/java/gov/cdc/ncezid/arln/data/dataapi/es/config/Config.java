package gov.cdc.ncezid.arln.data.dataapi.es.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;

import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "gov.cdc.ncezid.arln.data.dataapi.es.repository")
@ComponentScan(basePackages = { "gov.cdc.ncezid.arln.data.dataapi.es.service" })
public class Config {

    //@Value("${elasticsearch.home:/usr/local/Cellar/elasticsearch/5.6.0}")
   // private String elasticsearchHome;

    //@Value("${elasticsearch.cluster.name:elasticsearch}")
    //private String clusterName;

    @Bean
    public Client client() {
       TransportClient client = null;

        try {


            final Settings elasticsearchSettings = Settings.builder()
                    .put("client.transport.sniff", true)
                    .put("path.home", "/.")
                    .put("cluster.name", "docker-cluster").build();

            client = new PreBuiltTransportClient(elasticsearchSettings)
                .addTransportAddress(new TransportAddress(InetAddress.getByName("127.0.0.1"), 9300));

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return client;
    }

   @Bean
    public ElasticsearchOperations elasticsearchTemplate1() {
        return new ElasticsearchTemplate(client());
    }
}