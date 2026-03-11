package io.platform.fastboot.crds.specs;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatformServices {
    private List<DatabaseSpec> databases;
}
