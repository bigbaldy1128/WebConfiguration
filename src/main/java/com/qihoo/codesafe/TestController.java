package com.qihoo.codesafe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wangjinzhao on 2017/5/15.
 */
@RestController
public class TestController {
    @GetMapping("test")
    public String test()
    {
        return "test";
    }
}
