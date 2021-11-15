package org.acme.provider;

import io.smallrye.mutiny.Uni;
import io.smallrye.stork.DefaultServiceInstance;
import io.smallrye.stork.ServiceDiscovery;
import io.smallrye.stork.ServiceInstance;
import io.smallrye.stork.spi.ServiceInstanceIds;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class CustomServiceDiscovery implements ServiceDiscovery {


    public CustomServiceDiscovery() {
    }

    @Override
    public Uni<List<ServiceInstance>> getServiceInstances() {
        DefaultServiceInstance instance =
                new DefaultServiceInstance(ServiceInstanceIds.next(), "localhost", 9090, false);
        return Uni.createFrom().item(() -> Collections.singletonList(instance));
    }
}
