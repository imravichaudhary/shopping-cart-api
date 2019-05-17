package ca.ravichaudhary.apishoppingcart.config;

import com.mongodb.MongoClient;
import de.flapdoodle.embed.mongo.MongodExecutable;
import de.flapdoodle.embed.mongo.MongodProcess;
import de.flapdoodle.embed.mongo.MongodStarter;
import de.flapdoodle.embed.mongo.config.IMongodConfig;
import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
import de.flapdoodle.embed.mongo.config.Net;
import de.flapdoodle.embed.mongo.distribution.Version;
import de.flapdoodle.embed.process.runtime.Network;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.io.IOException;

//@Configuration
public class TestMongoConfig {

    private static String hostname = "localhost";
    private static int port = 27000;
    private static String databaseName = "test";

    @Bean
    public MongoTemplate mongoTemplate() {
        return new MongoTemplate(new MongoClient(hostname, port), databaseName);
    }

    @Bean(destroyMethod = "stop")
    public MongodProcess mongodProcess(MongodExecutable mongodExecutable) throws IOException {
        return mongodExecutable.start();
    }

    @Bean(destroyMethod = "stop")
    public MongodExecutable mongodExecutable(MongodStarter mongodStarter, IMongodConfig iMongodConfig) {
        return mongodStarter.prepare(iMongodConfig);
    }

    @Bean
    public IMongodConfig iMongodConfig() throws IOException {
        return new MongodConfigBuilder().version(Version.V4_0_2)
                .net(new Net(hostname, port, Network.localhostIsIPv6()))
                .build();
    }

    @Bean
    public MongodStarter mongodStarter() {
        return MongodStarter.getDefaultInstance();
    }
}
