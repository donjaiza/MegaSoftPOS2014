package sun.natee.winapp.test;

import java.util.ArrayList;
import sun.natee.winapp.pos.model.MenuGroupBean;
import sun.natee.winapp.pos.model.ProductBean;
import sun.natee.winapp.pos.model.ProductGroupBean;

public class TestMenuGroupBean {
    public static void main(String[] args) {
        ProductGroupBean group = new ProductGroupBean();
        group.setProductGroupCode("101");
        group.setProductGroupName("FOOD");

        ProductBean p1 = new ProductBean();
        p1.setProductCode("201");
        p1.setProductName("product1");

        ProductBean p2 = new ProductBean();
        p2.setProductCode("202");
        p2.setProductName("product2");

        ProductBean p3 = new ProductBean();
        p3.setProductCode("203");
        p3.setProductName("product3");

        group.addProduct(p1);
        group.addProduct(p2);
        group.addProduct(p3);

        MenuGroupBean menu = new MenuGroupBean();
        menu.addProductGroup(group);
        
        ArrayList list = menu.listProductGroup();
        for (int i = 0; i < list.size(); i++) {
            ProductGroupBean g = (ProductGroupBean)list.get(i);
            System.out.println(g.getProductGroupCode()+"="+g.getProductGroupName());
            ArrayList list2 = g.listProduct();
            for (int j = 0; j < list2.size(); j++) {                
                ProductBean p = (ProductBean)list2.get(j);
                System.out.println("===> "+p.getProductCode()+"="+p.getProductName());
            }
        }
    }
 
}
