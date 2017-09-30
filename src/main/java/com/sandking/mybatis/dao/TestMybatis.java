package com.sandking.mybatis.dao;

import com.sandking.mybatis.pojo.BbsEmployee;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class TestMybatis {

    private SqlSessionFactory sqlSessionFactory = null;

    @Before
    public void init() throws IOException {

        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = org.apache.ibatis.io.Resources.getResourceAsStream("SqlMapConfig.xml");
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);


    }

    @Test
    public void testQuery(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BbsEmployee bbsEmployee = sqlSession.selectOne("queryTest","a");
        System.out.println(bbsEmployee.getUsername());
        sqlSession.close();

    }

    @Test
    public void query1(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BbsEmployee bbsEmployee = sqlSession.selectOne("query1","ad");
        System.out.println(bbsEmployee.getUsername());
        sqlSession.close();

    }

    @Test
    public void query2(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BbsEmployee bbsEmployee = sqlSession.selectOne("query2","ad");
        System.out.println(bbsEmployee.getUsername());
        sqlSession.close();

    }

    @Test
    public void insert(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        BbsEmployee bbsEmployee = new BbsEmployee();
        bbsEmployee.setUsername("sisisi");
        bbsEmployee.setPassword("123");


        sqlSession.insert("insert",bbsEmployee);
        System.out.println(bbsEmployee);

        sqlSession.commit();
        sqlSession.close();


    }

    @Test
    public void update(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BbsEmployee bbsEmployee = new BbsEmployee();
        bbsEmployee.setId(5);
        bbsEmployee.setPassword("3425");

        sqlSession.update("update",bbsEmployee);
        sqlSession.commit();

        sqlSession.close();

    }

    @Test
    public void delete(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        sqlSession.delete("delete",6);
        sqlSession.commit();

        sqlSession.close();

    }
















}
