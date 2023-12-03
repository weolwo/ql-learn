package com.alex.service;


import com.alex.bean.PrizeRecords;
import com.alex.dao.PrizeRecordsMapper;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * BY Alex CREATED 2021/8/18
 */


@Service
public class PrizeRecordsService {

    @Resource
    PrizeRecordsMapper prizeRecordsMapper;

    List<PrizeRecords> selectPrizeList() {
       return prizeRecordsMapper.selectPrizeList();
    }

    @Transactional
    public int updateById() {
        List<PrizeRecords> prizeList = selectPrizeList();
        PrizeRecords prizeRecords = prizeList.get(0);
        System.out.println(prizeRecords.getPrizeName()+Thread.currentThread().getName());
        prizeRecords.setPrizeName("1");
        int i = prizeRecordsMapper.updateById(prizeRecords);
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        prizeList = selectPrizeList();
        prizeRecords = prizeList.get(0);

        System.out.println(prizeRecords.getPrizeName()+Thread.currentThread().getName());
     return 0;

    }

    @Transactional
    public int test(){
        updateById();
        try {
            TimeUnit.SECONDS.sleep(1);
            new Thread(()->updateById()).start();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return 0;
    }
}
