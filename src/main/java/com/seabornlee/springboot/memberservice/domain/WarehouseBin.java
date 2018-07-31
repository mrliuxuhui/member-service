package com.seabornlee.springboot.memberservice.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "warehouse_bin")
public class WarehouseBin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "bin_no")
    private String binNo;

    private String name;

    @Column(name = "area_type")
    private String areaType;

    @Column(name = "area_name")
    private String areaName;

    @Column(name = "shelf_no")
    private String shelfNo;

    @Column(name = "is_tmp")
    private Boolean isTmp;

    @Column(name = "is_enabled")
    private Boolean isEnabled;

    @Column(name = "data_source")
    private Integer dataSource;

    @Column(name = "warehouse_id")
    private Integer warehouseId;

    public Integer getId() {
        return id;
    }

    public WarehouseBin setId(Integer id) {
        this.id = id;
        return this;
    }

    public String getBinNo() {
        return binNo;
    }

    public WarehouseBin setBinNo(String binNo) {
        this.binNo = binNo;
        return this;
    }

    public String getName() {
        return name;
    }

    public WarehouseBin setName(String name) {
        this.name = name;
        return this;
    }

    public String getAreaType() {
        return areaType;
    }

    public WarehouseBin setAreaType(String areaType) {
        this.areaType = areaType;
        return this;
    }

    public String getAreaName() {
        return areaName;
    }

    public WarehouseBin setAreaName(String areaName) {
        this.areaName = areaName;
        return this;
    }

    public String getShelfNo() {
        return shelfNo;
    }

    public WarehouseBin setShelfNo(String shelfNo) {
        this.shelfNo = shelfNo;
        return this;
    }

    public Boolean getTmp() {
        return isTmp;
    }

    public WarehouseBin setTmp(Boolean tmp) {
        isTmp = tmp;
        return this;
    }

    public Boolean getEnabled() {
        return isEnabled;
    }

    public WarehouseBin setEnabled(Boolean enabled) {
        isEnabled = enabled;
        return this;
    }

    public Integer getDataSource() {
        return dataSource;
    }

    public WarehouseBin setDataSource(Integer dataSource) {
        this.dataSource = dataSource;
        return this;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public WarehouseBin setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
        return this;
    }
}
