package com.example.GestionAudioVisal.domain.service;

import com.example.GestionAudioVisal.persistence.entity.Color;

import java.util.List;

public interface ColorService {
    List<Color> getAllColors();
    Color getColorById(int id);
    Color saveColor(Color color);
    void deleteColor(int id);
}
