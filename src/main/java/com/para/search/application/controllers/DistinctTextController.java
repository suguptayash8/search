package com.para.search.application.controllers;


import com.para.search.application.payloads.TextData;
import com.para.search.application.service.FindDistinct;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/text")
public class DistinctTextController {

    @Resource
    private FindDistinct findDistinct;

    @PostMapping("/distinct")
    public ResponseEntity<Object> findDistinctCount(@RequestBody  TextData textData){
        Map<String, Integer> sol  = findDistinct.findDistinctWords(textData.getText());
        return new ResponseEntity<>(sol, HttpStatusCode.valueOf(200));
    }
}
