package org.acme.provider;

import io.smallrye.mutiny.Uni;
import io.smallrye.stork.api.ServiceDiscovery;
import io.smallrye.stork.api.ServiceInstance;
import io.smallrye.stork.impl.DefaultServiceInstance;
import io.smallrye.stork.utils.ServiceInstanceIds;

import java.util.Collections;
import java.util.List;

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
