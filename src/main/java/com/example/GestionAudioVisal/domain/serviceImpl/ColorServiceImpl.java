package com.example.GestionAudioVisal.domain.serviceImpl;

import com.example.GestionAudioVisal.domain.repository.ColorRepository;
import com.example.GestionAudioVisal.domain.service.ColorService;
import com.example.GestionAudioVisal.persistence.entity.Color;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ColorServiceImpl implements ColorService {

    private final ColorRepository colorRepository;

    @Autowired
    public ColorServiceImpl(ColorRepository colorRepository) {
        this.colorRepository = colorRepository;
    }

    @Override
    public List<Color> getAllColors() {
        return colorRepository.findAll();
    }

    @Override
    public Color getColorById(int id) {
        return colorRepository.findById(id).orElse(null);
    }

    @Override
    public Color saveColor(Color color) {
        return colorRepository.save(color);
    }

    @Override
    public void deleteColor(int id) {
        colorRepository.deleteById(id);
    }
}
