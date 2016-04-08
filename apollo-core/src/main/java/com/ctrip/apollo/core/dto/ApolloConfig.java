package com.ctrip.apollo.core.dto;

import com.google.common.base.MoreObjects;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * @author Jason Song(song_s@ctrip.com)
 */
public class ApolloConfig {

  private String appId;

  private String cluster;

  private String namespace;

  private Map<String, String> configurations;

  private long releaseId;

  @JsonCreator
  public ApolloConfig(@JsonProperty("appId") String appId,
                      @JsonProperty("cluster") String cluster,
                      @JsonProperty("namespace") String namespace,
                      @JsonProperty("releaseId") long releaseId) {
    super();
    this.appId = appId;
    this.cluster = cluster;
    this.namespace = namespace;
    this.releaseId = releaseId;
  }

  public String getAppId() {
    return appId;
  }

  public String getCluster() {
    return cluster;
  }

  public String getNamespace() {
    return namespace;
  }

  public long getReleaseId() {
    return releaseId;
  }

  public Map<String, String> getConfigurations() {
    return configurations;
  }

  public void setConfigurations(Map<String, String> configurations) {
    this.configurations = configurations;
  }

  @Override
  public String toString() {
    return MoreObjects.toStringHelper(this)
        .omitNullValues()
        .add("appId", appId)
        .add("cluster", cluster)
        .add("namespace", namespace)
        .add("releaseId", releaseId)
        .add("configurations", configurations)
        .toString();
  }
}
