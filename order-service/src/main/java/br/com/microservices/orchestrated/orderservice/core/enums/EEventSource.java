package br.com.microservices.orchestrated.orderservice.core.enums;

public enum EEventSource {

    ORCHESTRATOR,
    PRODUCT_VALIDATION_SERVICE,
    PAYMENT_SERVICE,
    INVENTORY_SERVICE;

}
