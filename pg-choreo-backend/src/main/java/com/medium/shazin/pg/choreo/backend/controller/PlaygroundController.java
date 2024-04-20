package com.medium.shazin.pg.choreo.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/playground")
public class PlaygroundController {

    @GetMapping
    public String get() {
        return "data is ready";
    }
}
