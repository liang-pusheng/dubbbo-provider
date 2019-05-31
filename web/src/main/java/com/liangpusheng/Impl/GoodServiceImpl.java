package com.liangpusheng.Impl;

import com.liangpusheng.common.ServerResponse;
import com.liangpusheng.pojo.Good;
import com.liangpusheng.repository.GoodRepository;
import com.liangpusheng.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("goodService")
public class GoodServiceImpl implements GoodService {

    @Autowired
    private GoodRepository goodRepository;

    @Override
    public ServerResponse listAllGood() {
        List<Good> goodList = goodRepository.findAll();
        return ServerResponse.createBySuccess(1, goodList);
    }

    @Override
    public ServerResponse getGood(Integer id) {
        Optional<Good> good = goodRepository.findById(id);
        return ServerResponse.createBySuccess(1, good);
    }
}
