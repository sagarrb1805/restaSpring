package com.example.resta.Controllers;

import com.example.resta.Schema.Menu;
import com.example.resta.Services.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MenuController {
    @Autowired
    private MenuService menuService;

    @PostMapping("/addMenu")
    public Menu addMenu(@RequestBody Menu menu){
        return menuService.addToMenu(menu);
    }
    @GetMapping("/getMenu")
    public List<Menu> getMenu(){
        return menuService.getMenu();
    }

}
