package io.platform.fastboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.platform.fastboot.controllers.DatabaseController;
import io.platform.fastboot.controllers.PlatformController;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;
import io.javaoperatorsdk.operator.Operator;

@Configuration
public class OperatorConfig {

    @Bean
    public KubernetesClient kubernetesClient() {
        return new KubernetesClientBuilder().build();
    }

    @Bean
    public Operator operator(KubernetesClient client,
        PlatformController platformController,
        DatabaseController databaseController) {

        Operator operator = new Operator();

        operator.register(platformController);
        operator.register(databaseController);

        operator.start();

        return operator;
    }
}
