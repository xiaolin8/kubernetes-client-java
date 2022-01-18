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

public class V1CustomResourceDefinitionListBuilder
    extends io.kubernetes.client.openapi.models.V1CustomResourceDefinitionListFluentImpl<
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionListBuilder>
    implements io.kubernetes.client.fluent.VisitableBuilder<
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionList,
        io.kubernetes.client.openapi.models.V1CustomResourceDefinitionListBuilder> {
  public V1CustomResourceDefinitionListBuilder() {
    this(false);
  }

  public V1CustomResourceDefinitionListBuilder(java.lang.Boolean validationEnabled) {
    this(new V1CustomResourceDefinitionList(), validationEnabled);
  }

  public V1CustomResourceDefinitionListBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionListFluent<?> fluent) {
    this(fluent, false);
  }

  public V1CustomResourceDefinitionListBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionListFluent<?> fluent,
      java.lang.Boolean validationEnabled) {
    this(fluent, new V1CustomResourceDefinitionList(), validationEnabled);
  }

  public V1CustomResourceDefinitionListBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionList instance) {
    this(fluent, instance, false);
  }

  public V1CustomResourceDefinitionListBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionListFluent<?> fluent,
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = fluent;
    fluent.withApiVersion(instance.getApiVersion());

    fluent.withItems(instance.getItems());

    fluent.withKind(instance.getKind());

    fluent.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  public V1CustomResourceDefinitionListBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionList instance) {
    this(instance, false);
  }

  public V1CustomResourceDefinitionListBuilder(
      io.kubernetes.client.openapi.models.V1CustomResourceDefinitionList instance,
      java.lang.Boolean validationEnabled) {
    this.fluent = this;
    this.withApiVersion(instance.getApiVersion());

    this.withItems(instance.getItems());

    this.withKind(instance.getKind());

    this.withMetadata(instance.getMetadata());

    this.validationEnabled = validationEnabled;
  }

  io.kubernetes.client.openapi.models.V1CustomResourceDefinitionListFluent<?> fluent;
  java.lang.Boolean validationEnabled;

  public io.kubernetes.client.openapi.models.V1CustomResourceDefinitionList build() {
    V1CustomResourceDefinitionList buildable = new V1CustomResourceDefinitionList();
    buildable.setApiVersion(fluent.getApiVersion());
    buildable.setItems(fluent.getItems());
    buildable.setKind(fluent.getKind());
    buildable.setMetadata(fluent.getMetadata());
    return buildable;
  }

  public boolean equals(java.lang.Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    if (!super.equals(o)) return false;
    V1CustomResourceDefinitionListBuilder that = (V1CustomResourceDefinitionListBuilder) o;
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
