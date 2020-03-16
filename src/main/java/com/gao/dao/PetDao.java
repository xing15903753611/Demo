package com.gao.dao;

import com.gao.pojo.Pet;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PetDao {

    int saveTag(Pet tag);

    int deleteTag(Long id);

    int updateTag(Pet tag);

    Pet getById(Long id);

    Pet getByName(String name);

    List<Pet> getAllTag();

    List<Pet> getAdminTag();

}
