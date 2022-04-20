package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_product")
public class Products {
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    private Long productId;

    @Column(length = 100, nullable = false, unique = true) 
    private String productName;

    private Long brandId;
    private Long categoryid;
    private Integer createdDate;
    private Integer listPrice;

    @ManyToOne
    @JoinColumn(name = "productId", nullable = false)
    private Category category;
  



    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public Long getBrandId() {
        return brandId;
    }
    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }
    public Long getCategoryid() {
        return categoryid;
    }
    public void setCategoryid(Long categoryid) {
        this.categoryid = categoryid;
    }
    public Integer getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Integer createdDate) {
        this.createdDate = createdDate;
    }
    public Integer getListPrice() {
        return listPrice;
    }
    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    

}
