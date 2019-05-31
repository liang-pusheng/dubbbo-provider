package com.liangpusheng.service;

import com.liangpusheng.common.ServerResponse;

public interface GoodService {

    ServerResponse listAllGood();

    ServerResponse getGood(Integer id);
}
