
package org.raml.jaxrs.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * A collection fylm purchases
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "size",
    "purchases"
})
public class Purchases {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("purchases")
    private List<Purchase> purchases = new ArrayList<Purchase>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     * @return
     *     The size
     */
    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    /**
     * 
     * (Required)
     * 
     * @param size
     *     The size
     */
    @JsonProperty("size")
    public void setSize(Integer size) {
        this.size = size;
    }

    public Purchases withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * 
     * @return
     *     The purchases
     */
    @JsonProperty("purchases")
    public List<Purchase> getPurchases() {
        return purchases;
    }

    /**
     * 
     * @param purchases
     *     The purchases
     */
    @JsonProperty("purchases")
    public void setPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
    }

    public Purchases withPurchases(List<Purchase> purchases) {
        this.purchases = purchases;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Purchases withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
