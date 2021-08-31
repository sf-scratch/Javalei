package com.leige.dao;

import com.leige.pojo.Father;
import com.leige.pojo.Son;
import com.leige.pojo.User;
import com.leige.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {


    static Logger logger = Logger.getLogger(UserDaoTest.class);

    @Test
    public void testLog4j(){
        logger.info("info:999");
        logger.debug("debug:999");
        logger.error("debug:999");
    }


    @Test
    public void test(){
        //获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        //关闭SqlSession
        sqlSession.close();

    }
    @Test
    public void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userId = mapper.getUserId(1);
        System.out.println(userId);
        sqlSession.close();
    }
    @Test
    public void test3(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(02);
        user.setUsername("零二");
        user.setPassword("02");
        int a = mapper.addUser(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test4(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setId(2);
        user.setUsername("996");
        mapper.updateUser(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void test5(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserById(22);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test_1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SonMapper sonMapper = sqlSession.getMapper(SonMapper.class);
        List<Son> sonList = sonMapper.getSon2();
        for (Son son:sonList){
            System.out.println(son);
        }
        sqlSession.close();

    }
    @Test
    public void test_2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FatherMapper fatherMapper = sqlSession.getMapper(FatherMapper.class);
        List<Father> fatherList = fatherMapper.getFather();
        for (Father father:fatherList){
            System.out.println(father);
        }
        sqlSession.close();
    }
}
