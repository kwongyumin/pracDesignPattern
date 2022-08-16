package web;

import domain.userInfo.dao.UserInfoDao;
import factory.DaoFactory;
import factory.MysqlDaoFactory;
import factory.OracleDaoFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class webClient {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("db properties");

        Properties prop = new Properties();

        prop.load(fis);

        String dbType = prop.getProperty("DBTYPE");

        //UserInfo & Product 더미값 셋팅 ,

        DaoFactory daoFactory = null;

        if(dbType.equals("MYSQL")){
            daoFactory = new MysqlDaoFactory();
        }

        else if (dbType.equals("ORACLE")){
            daoFactory = new OracleDaoFactory();
        }

        else { // Exception + log ,
            System.out.println("EXCEPTION : " + "log");
        }

        // 유저정보
        UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
        System.out.println("====USERINFO TRANSACTION");
//        userInfoDao.insertProduct(userInfo);
//        userInfoDao.updateProduct(userInfo);
//        userInfoDao.deleteProduct(userInfo);
        // 상품
        // 위와 마찬가지로 더미데이터 CRUD ,

        /*
            서비스 ,레포지토리 계층에서
            인터페이스 구현체를 생성하여
            기능에 따른 메소드를 호출하는 방식의 패턴 ,

           코드간의 결합력이 낮아지며 , 유연성이 높아진다
           즉 , 확장성이 커진다.



         */



    }
}
