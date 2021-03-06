package io.quarkus.resteasy.server.common.deployment;

import java.util.Map;

import io.quarkus.builder.item.SimpleBuildItem;

/**
 * A build item that represents the configuration of the RESTEasy server.
 */
public final class ResteasyServerConfigBuildItem extends SimpleBuildItem {

    private final String path;

    private final Map<String, String> initParameters;

    public ResteasyServerConfigBuildItem(String path, Map<String, String> initParameters) {
        this.path = path;
        this.initParameters = initParameters;
    }

    public String getPath() {
        return path;
    }

    public Map<String, String> getInitParameters() {
        return initParameters;
    }
}
