package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_stock")
public class stocks {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long stocksId;

    @Column(length = 100, nullable = false, unique = true)
    private Long productId;

    @Column(length = 100, nullable = false, unique = true)
    private Long quantity;

    public Long getStocksId() {
        return stocksId;
    }

    public void setStocksId(Long stocksId) {
        this.stocksId = stocksId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }


    
}
