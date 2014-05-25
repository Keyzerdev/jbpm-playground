package org.jbpm.examples.purchases;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Purchase Order Line")
public class PurchaseOrderLine  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Total")
    private java.lang.Double total;
    
    @org.kie.api.definition.type.Label(value = "Amount")
    private java.lang.Double amount;
    
    @org.kie.api.definition.type.Label(value = "Description")
    private java.lang.String description;
    
    @org.kie.api.definition.type.Label(value = "Unit price")
    private java.lang.Double unitPrice;

    public PurchaseOrderLine() {

    }
    
    public java.lang.Double getTotal() {
        return this.total;
    }

    public void setTotal(  java.lang.Double total ) {
        this.total = total;
    }
    
    public java.lang.Double getAmount() {
        return this.amount;
    }

    public void setAmount(  java.lang.Double amount ) {
        this.amount = amount;
    }
    
    public java.lang.String getDescription() {
        return this.description;
    }

    public void setDescription(  java.lang.String description ) {
        this.description = description;
    }
    
    public java.lang.Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(  java.lang.Double unitPrice ) {
        this.unitPrice = unitPrice;
    }
    
   




}
