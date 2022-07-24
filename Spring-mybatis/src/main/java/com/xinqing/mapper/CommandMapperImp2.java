package com.xinqing.mapper;

import com.xinqing.entity.Command;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-24 10:35
 */
public class CommandMapperImp2 extends SqlSessionDaoSupport implements CommandMapper {
    public List<Command> select(int id) {
        return getSqlSession().getMapper(CommandMapper.class).select(id);
    }
}
