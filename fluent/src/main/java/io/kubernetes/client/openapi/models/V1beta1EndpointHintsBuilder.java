/*
Copyright 2022 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

public class V1beta1EndpointHintsBuilder
    extends io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluentImpl<
        io.kubernetes.client.openapi.models.V1beta1EndpointHintsBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1beta1EndpointHints,
        io.kubernetes.client.openapi.models.V1beta1EndpointHintsBuilder> {
  public V1beta1EndpointHintsBuilder() {
    this(false);
  }

  public V1beta1EndpointHintsBuilder(java.lang.Boolean validationEnabled) {
    this(new V1beta1EndpointHints(), validationEnabled);
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<?> fluent) {
    this(fluent, false);
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1beta1EndpointHints(), validationEnabled);
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointHints instance) {
    this(fluent, instance, false);
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1beta1EndpointHints instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withForZones(instance.getForZones());

    this.validationEnabled = validationEnabled;
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHints instance) {
    this(instance, false);
  }

  public V1beta1EndpointHintsBuilder(
      io.kubernetes.client.openapi.models.V1beta1EndpointHints instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withForZones(instance.getForZones());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1beta1EndpointHintsFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1beta1EndpointHints build() {
    V1beta1EndpointHints buildable = new V1beta1EndpointHints();
    buildable.setForZones(fluent.getForZones());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1beta1EndpointHintsBuilder that = (V1beta1EndpointHintsBuilder) o;
    if (fluent != null && fluent != this
        ? !fluent.equals(that.fluent)
        : that.fluent != null && fluent != this) return false;

    if (validationEnabled != null
        ? !validationEnabled.equals(that.validationEnabled)
        : that.validationEnabled != null) return false;
    return true;
  }

  public int hashCode() {
    return java.util.Objects.hash(fluent, validationEnabled, super.hashCode());
  }
}
