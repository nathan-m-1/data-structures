package com.datastructures.tries.controllers;

import com.datastructures.tries.services.AutocompleteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutocompleteController {

    private final AutocompleteService service;

    public AutocompleteController(AutocompleteService service) {
        this.service = service;
    }

    @GetMapping("/autocomplete")
    public List<String> autocomplete(@RequestParam String q) {
        return service.sugerencias(q);
    }
}
