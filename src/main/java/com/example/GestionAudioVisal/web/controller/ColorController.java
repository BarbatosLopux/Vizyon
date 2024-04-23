package com.example.GestionAudioVisal.web.controller;

import com.example.GestionAudioVisal.domain.service.ColorService;
import com.example.GestionAudioVisal.persistence.entity.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/colors")
public class ColorController {

    private final ColorService colorService;

    @Autowired
    public ColorController(ColorService colorService) {
        this.colorService = colorService;
    }

    @GetMapping
    public ResponseEntity<List<Color>> getAllColors() {
        List<Color> colors = colorService.getAllColors();
        return new ResponseEntity<>(colors, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Color> getColorById(@PathVariable("id") int id) {
        Color color = colorService.getColorById(id);
        if (color == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(color, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Color> createColor(@RequestBody Color color) {
        Color createdColor = colorService.saveColor(color);
        return new ResponseEntity<>(createdColor, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteColor(@PathVariable("id") int id) {
        colorService.deleteColor(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
