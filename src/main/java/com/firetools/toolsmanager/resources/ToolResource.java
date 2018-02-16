package com.firetools.toolsmanager.resources;

import com.firetools.toolsmanager.dao.Tool;
import com.firetools.toolsmanager.service.ToolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/tool")
public class ToolResource {

    @Autowired
    private ToolService toolService;

    @RequestMapping(path = "/{id}")
    public Tool getTool(@PathVariable(name = "id") String id) {
        return toolService.findToolById(id);
    }
}
