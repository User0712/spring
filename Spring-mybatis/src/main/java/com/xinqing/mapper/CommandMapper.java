package com.xinqing.mapper;

import com.xinqing.entity.Command;

import java.util.List;

/**
 * @author 心晴_xiao
 * @company 快乐精灵公司
 * @create 2022-07-23 22:55
 */
public interface CommandMapper {
    List<Command> select(int id);
}
