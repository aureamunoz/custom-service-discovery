package org.acme.provider;

import io.smallrye.stork.api.ServiceDiscovery;
import io.smallrye.stork.api.config.ServiceConfig;
import io.smallrye.stork.api.config.ServiceDiscoveryAttribute;
import io.smallrye.stork.api.config.ServiceDiscoveryType;
import io.smallrye.stork.spi.StorkInfrastructure;
import io.smallrye.stork.spi.ServiceDiscoveryProvider;

@ServiceDiscoveryAttribute(name = "custom-host", description = "The Consul host.", defaultValue = "localhost")
@ServiceDiscoveryAttribute(name = "custom-port", description = "The Consul port.", defaultValue = "8500")
@ServiceDiscoveryAttribute(name = "refresh-period", description = "Service discovery cache refresh period.", defaultValue = "5M")
@ServiceDiscoveryType("custom")
public class CustomServiceDiscoveryProvider implements ServiceDiscoveryProvider<CustomServiceDiscoveryProviderConfiguration> {

    @Override
    public ServiceDiscovery createServiceDiscovery(CustomServiceDiscoveryProviderConfiguration customServiceDiscoveryProviderConfiguration, String s, ServiceConfig serviceConfig, StorkInfrastructure storkInfrastructure) {
        return null;
    }
}
