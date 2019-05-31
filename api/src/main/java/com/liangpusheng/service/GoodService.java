package com.liangpusheng.service;

import com.liangpusheng.common.ServerResponse;
import com.liangpusheng.pojo.Good;

import java.util.List;

public interface GoodService {

    ServerResponse listAllGood();

    ServerResponse getGood(Integer id);
}
