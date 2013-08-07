package sun.natee.winapp.pos.model;

import java.util.ArrayList;

public class ProductGroupBean {

    private String productGroupCode;
    private String productGroupName;
    private ArrayList<ProductBean> listProductBean;

    public ProductGroupBean() {
        listProductBean = new ArrayList<>();
    }

    public String getProductGroupCode() {
        return productGroupCode;
    }

    public void setProductGroupCode(String productGroupCode) {
        this.productGroupCode = productGroupCode;
    }

    public String getProductGroupName() {
        return productGroupName;
    }

    public void setProductGroupName(String productGroupName) {
        this.productGroupName = productGroupName;
    }

    public ArrayList<ProductBean> listProduct() {
        return listProductBean;
    }

    public ProductBean listProductAt(int index) {
        if (index < 0 || index > listProductBean.size() - 1) {
            return new ProductBean();
        }

        return listProductBean.get(index);
    }

    public void addProduct(ProductBean productBean) {
        listProductBean.add(productBean);
    }
    
}
