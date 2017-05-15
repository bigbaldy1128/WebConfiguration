package com.example.demo.web;

import com.example.demo.domain.Hello;
import com.example.demo.domain.World;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjinzhao on 2017/5/15.
 */
@RestController
public class MyController {
    @GetMapping("hello")
    public Hello hello()
    {
        Hello hello=new Hello(1,2,3);
        World world=new World(4,5);
        List<World> worlds=new ArrayList<>();
        worlds.add(world);
        hello.setWorlds(worlds);
        return hello;
    }
}
