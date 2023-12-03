package com.alex.bean;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PrizeRecords {

    private Integer id;

    private String prizeName;

    private BigDecimal prizeAmount;
}
