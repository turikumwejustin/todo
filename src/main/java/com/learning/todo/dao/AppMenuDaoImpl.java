package com.learning.todo.dao;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.learning.todo.models.AppMenu;

@Repository
public class AppMenuDaoImpl implements AppMenuDao{

    private List<AppMenu> menus=new LinkedList<>(
       Arrays.asList(
        new AppMenu("01","Create User","ADMIN"),
        new AppMenu("02","Delete User","ADMIN"),
        new AppMenu("03","Create Order","SALES"),
        new AppMenu("04","List Orders","SALES")
       )
    );

    @Override
    public List<AppMenu> getAllMenus() {
        return this.menus;
    }

    @Override
    public List<AppMenu> getAllMenusByRole(String role) {
      return getAllMenus().stream().filter(theRole->theRole.getRole().trim().equals(role.trim())).collect(Collectors.toList());
    }

}