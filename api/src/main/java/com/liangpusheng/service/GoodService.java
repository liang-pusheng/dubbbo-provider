package com.liangpusheng.service;

import com.liangpusheng.pojo.Good;

import java.util.List;

public interface GoodService {

    List<Good> listAllGood();

    Good getGood(Integer id);
}
