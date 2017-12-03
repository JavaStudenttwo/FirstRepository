package com.sandking.mybatis.dao;

import com.sandking.mybatis.pojo.BbsEmployee;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

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
        BbsEmployee employee = new BbsEmployee();
        employee.setUsername("%ad%");
        employee.setPassword("%1%");
        BbsEmployee bbsEmployee = sqlSession.selectOne("queryTest",employee);

        System.out.println(bbsEmployee);
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
        bbsEmployee.setIsDel(true);


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


    @Test
    public void query3(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        BbsEmployee employee = new BbsEmployee();
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("4");
        list.add("5");
        employee.setIds(list);
        List<BbsEmployee> list1 = sqlSession.selectList("query3",employee);
        for (BbsEmployee e:list1) {
            System.out.println(e);
        }

        sqlSession.close();

    }














}
