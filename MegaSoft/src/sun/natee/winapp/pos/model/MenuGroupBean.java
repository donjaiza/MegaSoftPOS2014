package sun.natee.winapp.pos.model;

import java.util.ArrayList;

public class MenuGroupBean {

    private String menuGroupCode;
    private String menuGroupName;
    private ArrayList<ProductGroupBean> listProductGroupBean;

    public MenuGroupBean() {
        listProductGroupBean = new ArrayList<>();
    }

    public ArrayList<ProductGroupBean> listProductGroup() {
        return listProductGroupBean;
    }

    public ProductGroupBean listProductGroupAt(int index) {
        if (index < 0 || index > listProductGroupBean.size() - 1) {
            return new ProductGroupBean();
        }

        return listProductGroupBean.get(index);
    }

    public void addProductGroup(ProductGroupBean productGroupBean) {
        listProductGroupBean.add(productGroupBean);
    }

    public String getMenuGroupCode() {
        return menuGroupCode;
    }

    public void setMenuGroupCode(String menuGroupCode) {
        this.menuGroupCode = menuGroupCode;
    }

    public String getMenuGroupName() {
        return menuGroupName;
    }

    public void setMenuGroupName(String menuGroupName) {
        this.menuGroupName = menuGroupName;
    }
}
