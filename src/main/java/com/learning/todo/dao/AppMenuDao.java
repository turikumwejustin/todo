package com.learning.todo.dao;
import java.util.List;
import com.learning.todo.models.AppMenu;

public interface AppMenuDao {
    List<AppMenu>getAllMenus();
    List<AppMenu>getAllMenusByRole(String role);
}
