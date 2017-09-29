package com.sandking.mybatis.dao;

import com.sandking.mybatis.pojo.BbsEmployee;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

public class BbsDao {

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
        BbsEmployee bbsEmployee = sqlSession.selectOne("queryTest","admin");
        System.out.println(bbsEmployee);
        sqlSession.close();

    }



















}
