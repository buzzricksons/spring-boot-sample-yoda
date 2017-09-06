package com.example.demo.mapper

import com.example.demo.City
import org.apache.ibatis.annotations.Delete
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select
import org.apache.ibatis.annotations.Update

@Mapper
interface CityMapperGroovy {
    //CREATE
    @Insert('''
            INSERT INTO
                tcity (code, name, state, country)
                values (#{code}, #{name}, #{state}, #{country})
    ''')
    int insert(City city)


    //READ
    @Select('''
            SELECT 
                code, name, state, country 
            FROM 
                tcity
            WHERE 
                code = #{code}
    ''')
    City findByCode(String code)

    //UPDATE
    @Update('''
            UPDATE
                tcity
            SET
                name = #{name}
            WHERE
                code = #{code}
    ''')
    City updateNamebyCode(String code, String name)


    //DELETE
    @Delete('''
            DELETE
            FROM
                tcity
            WHERE
                code = #{code}
    ''')
    void deleteByCode(String code)
}