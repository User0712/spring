package com.xinqing.mapper;

import com.xinqing.entity.Command;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 22:59
 */
public class CommandMapperImp implements CommandMapper {
    private SqlSessionTemplate sqlSession;


    public List<Command> select(int id) {
        return sqlSession.getMapper(CommandMapper.class).select(id);
    }

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

}
