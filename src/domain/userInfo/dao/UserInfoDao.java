package domain.userInfo.dao;

import domain.userInfo.UserInfo;

public interface UserInfoDao {

    void insertProduct(UserInfo userInfo);
    void updateProduct(UserInfo userInfo);
    void deleteProduct(UserInfo userInfo);
}
