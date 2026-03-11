package io.platform.fastboot.services.database;

import io.platform.fastboot.crds.Database;

public interface DatabaseProvisioner {
    void provision(Database database);
    boolean supports(String type);
    boolean isRequiredResourcesAvailable(Database database);
}
