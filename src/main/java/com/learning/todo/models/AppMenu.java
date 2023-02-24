package com.learning.todo.models;

public class AppMenu {
    private String menuId;
    private String menuName;
    private String role;
    
    public String getMenuId() {
        return menuId;
    }
    public String getMenuName() {
        return menuName;
    }
    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }
    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public AppMenu(String menuId, String menuName, String role) {
        this.menuId = menuId;
        this.menuName = menuName;
        this.role = role;
    }
    @Override
    public String toString() {
        return "AppMenu [menuId=" + menuId + ", menuName=" + menuName + ", role=" + role + "]";
    }

    
}
