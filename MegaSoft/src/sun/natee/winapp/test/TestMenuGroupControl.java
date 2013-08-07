package sun.natee.winapp.test;

import java.util.ArrayList;
import sun.natee.winapp.pos.controller.MenuGroupControl;
import sun.natee.winapp.pos.model.MenuGroupBean;
import sun.natee.winapp.pos.model.ProductBean;
import sun.natee.winapp.pos.model.ProductGroupBean;

public class TestMenuGroupControl {

    public static void main(String[] args) {
        MenuGroupControl menuControl = new MenuGroupControl();
        ArrayList arrData = menuControl.listMenuGroup();
        for (int i = 0; i < arrData.size(); i++) {
            MenuGroupBean menuGroup = (MenuGroupBean) arrData.get(i);
            System.out.println(menuGroup.getMenuGroupCode() + "=" + menuGroup.getMenuGroupName());
            ArrayList arrData2 = menuGroup.listProductGroup();
            for (int j = 0; j < arrData2.size(); j++) {
                ProductGroupBean pGroup = (ProductGroupBean) arrData2.get(j);
                System.out.println("   +" + pGroup.getProductGroupCode() + "=" + pGroup.getProductGroupName());
                ArrayList arrData3 = pGroup.listProduct();
                for (int k = 0; k < arrData3.size(); k++) {
                    ProductBean p = (ProductBean) arrData3.get(k);
                    System.out.println("      -" + p.getProductCode() + "=" + p.getProductName());

                }
            }
        }
    }
}
