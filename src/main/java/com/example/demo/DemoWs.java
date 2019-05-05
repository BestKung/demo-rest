package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DemoWs{

@GetMapping(value="/test")
public Map<String , String> test(){
Map<String , String> map = new HashMap<String,String>();
map.put("test","Hello Test");
map.put("day","05/05/60");
    return map;
}

@GetMapping(value="/demo")
public Map<String , String> yyyyy(){
Map<String , String> map = new HashMap<String,String>();
map.put("demo","Hello demo");
map.put("day","05/05/60");
    return map;
}


}

