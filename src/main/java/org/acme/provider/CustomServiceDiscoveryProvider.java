package org.acme.provider;

import io.smallrye.stork.ServiceDiscovery;
import io.smallrye.stork.config.ServiceConfig;
import io.smallrye.stork.config.ServiceDiscoveryConfig;
import io.smallrye.stork.spi.ServiceDiscoveryProvider;

public class CustomServiceDiscoveryProvider implements ServiceDiscoveryProvider {
    @Override
    public String type() {
        return "custom";
    }

    @Override
    public ServiceDiscovery createServiceDiscovery(ServiceDiscoveryConfig config,
                                                   String serviceName,
                                                   ServiceConfig serviceConfig) {
        return new CustomServiceDiscovery();
    }
}
