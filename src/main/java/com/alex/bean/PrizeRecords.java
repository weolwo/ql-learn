package com.alex.bean;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class PrizeRecords {

    private Long id;

    private List<String> list;

    private String prizeName;

    private BigDecimal prizeAmount;
}
