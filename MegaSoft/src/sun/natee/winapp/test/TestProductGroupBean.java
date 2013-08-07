package sun.natee.winapp.test;

import sun.natee.winapp.pos.model.ProductBean;
import sun.natee.winapp.pos.model.ProductGroupBean;

public class TestProductGroupBean {
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

        ProductBean product = group.listProductAt(2);
        System.out.println("CODE: " + product.getProductCode() + " , NAME: " + product.getProductName());

        /*ArrayList arrData = group.listProduct();
         for (int i = 0; i < arrData.size(); i++) {
         ProductBean product = (ProductBean)arrData.get(i);
         System.out.println("CODE: "+product.getProductCode()+" , NAME: "+product.getProductName());
         }*/
    }
    
}
