package com.almacen.allmacenservice.response;

public class InventoryResponseRest extends ResponseRest{

    private InventoroyResponse inventoryResponse = new InventoroyResponse();

    public InventoroyResponse getInventoryResponse() {
        return inventoryResponse;
    }

    public void setInventoryResponse(InventoroyResponse inventoryResponse) {
        this.inventoryResponse = inventoryResponse;
    }
}
