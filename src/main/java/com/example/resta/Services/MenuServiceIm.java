package com.example.resta.Services;

import com.example.resta.Repository.MenuRepo;
import com.example.resta.Schema.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenuServiceIm implements MenuService{
    @Autowired
    private MenuRepo menuRepo;
    @Override
    public Menu addToMenu(Menu menuItem) {
        menuRepo.save(menuItem);
        return menuItem;
    }

    @Override
    public List<Menu> getMenu() {
        return (List<Menu>) menuRepo.findAll();
    }
}
