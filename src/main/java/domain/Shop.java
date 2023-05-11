package domain;

import config.DBConnection;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor @AllArgsConstructor
public class Shop {
    private int shopId;
    private String name;
    private String tel;
    DBConnection dbConnection=new DBConnection();

    public Shop(int shopId, String shopName, String shopTel) {
        this.shopId=shopId;
        this.name=shopName;
        this.tel=shopTel;
    }


//    public Menu showMenu(){
//        String query="select * from menu where shop_id=?";
//
//    }
}
