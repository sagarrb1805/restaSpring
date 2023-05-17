package com.example.resta.Services;

import com.example.resta.Schema.Menu;

import java.util.List;

public interface MenuService {
    Menu addToMenu(Menu menuItem);
    List<Menu> getMenu();
}
