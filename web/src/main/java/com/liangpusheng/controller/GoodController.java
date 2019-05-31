package com.liangpusheng.controller;

import com.liangpusheng.common.ServerResponse;
import com.liangpusheng.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/good")
public class GoodController {

    @Autowired
    private GoodService goodService;

    @GetMapping("/list")
    public ServerResponse listAllGood() {
        return goodService.listAllGood();
    }

    @GetMapping("/{id}")
    public ServerResponse getGood(@PathVariable("id") Integer id) {
        return goodService.getGood(id);
    }
}
