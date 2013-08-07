package sun.natee.winapp.pos.controller;

import java.util.ArrayList;
import sun.natee.winapp.pos.model.MenuGroupBean;
import sun.natee.winapp.pos.model.ProductBean;
import sun.natee.winapp.pos.model.ProductGroupBean;

public class MenuGroupControl {

    private ArrayList<MenuGroupBean> listMenuGroup;

    public MenuGroupControl() {
        listMenuGroup = new ArrayList<>();
    }

    public ArrayList<MenuGroupBean> listMenuGroup() {
        MenuGroupBean menu = new MenuGroupBean();
        
        menu.setMenuGroupCode("001");
        menu.setMenuGroupName("FOOD");
        
        ProductGroupBean g1 = new ProductGroupBean();
        g1.setProductGroupCode("101");
        g1.setProductGroupName("Padthai");
        
        ProductGroupBean g2 = new ProductGroupBean();
        g2.setProductGroupCode("102");
        g2.setProductGroupName("Kaphroaw");
        
        ProductBean p1 = new ProductBean();
        p1.setProductCode("201");
        p1.setProductName("Bread");
        
        ProductBean p2 = new ProductBean();
        p2.setProductCode("202");
        p2.setProductName("Car Wash");
        
        ProductBean p3 = new ProductBean();
        p3.setProductCode("203");
        p3.setProductName("Bread24");
        
        ProductBean p4 = new ProductBean();
        p4.setProductCode("204");
        p4.setProductName("Car Wash55");
        
        g1.addProduct(p1);
        g1.addProduct(p2);
        
        g2.addProduct(p3);
        g2.addProduct(p4);
        
        menu.addProductGroup(g1);
        menu.addProductGroup(g2);
        
        listMenuGroup.add(menu);
                        
        
        return listMenuGroup;
    }
    
    public MenuGroupBean getListMenuGroup(int index) {
        if (index < 0 || index > listMenuGroup.size() - 1) {
            return new MenuGroupBean();
        }

        return listMenuGroup.get(index);
    }
}
