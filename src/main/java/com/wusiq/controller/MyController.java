package com.wusiq.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @Description:
 * @Author: v_wbsqwu
 * @Date: 2017/12/15 10:24
 */
@RestController
@RequestMapping(value = "user")
public class MyController {
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getById(@PathVariable Long id){
        System.out.println("id:"+id);
        return "dwusiq";
    }
}

