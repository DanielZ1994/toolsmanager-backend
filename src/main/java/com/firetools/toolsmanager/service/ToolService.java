package com.firetools.toolsmanager.service;

import com.firetools.toolsmanager.dao.Tool;
import org.springframework.stereotype.Service;

@Service
public class ToolService {

    public Tool findToolById(String id) {
        return new Tool();
    }
}
