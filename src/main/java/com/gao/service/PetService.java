package com.gao.service;

import com.gao.pojo.Pet;

import java.util.List;

public interface PetService {
    int saveTag(Pet tag);

    int deleteTag(Long id);

    int updateTag(Pet tag);

    Pet getById(Long id);

    Pet getByName(String name);

    List<Pet> getAllTag();

    List<Pet> getTagByString(String text);

    List<Pet> getAdminTag();
}
