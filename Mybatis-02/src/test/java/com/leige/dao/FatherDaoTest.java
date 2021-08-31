package com.leige.dao;

import com.leige.pojo.Father;
import com.leige.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class FatherDaoTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        FatherMapper fatherMapper = sqlSession.getMapper(FatherMapper.class);
        Father lei = fatherMapper.get_Father("lei");
        System.out.println(lei);


        sqlSession.close();
    }
    @Test
    public void test2(){
//        String a="123 456789";
//        String b="34";
//        char cc=a.charAt(5);
//        String c=String.valueOf(a.charAt(6));
//        char aa = ' ';
//        System.out.println(c);
//        char[] charArrays = new char[]{'1', '2', '3', 'A', 'B', 'C'};
//        System.out.println(String.valueOf('c'));
        String s="123 45 699";
        String a="";
        String b="";
        String c="";
        int len=s.length();
        for(int i=0;i<len;i++){
            if(s.charAt(i)==' '){
                b=b+(new StringBuilder(a).reverse().toString())+" ";
                a="";
            }else{
                c=String.valueOf(s.charAt(i));
                a=a+c;
            }
            if(i==(len-1)){
                b=b+(new StringBuilder(a).reverse().toString());
            }
        }
    }
}
